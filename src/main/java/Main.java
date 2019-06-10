import dao.repository.AccountRepository;
import dao.repository.IAccountRepository;
import demo.Demo;
import dto.entity.Account;
import services.IMoneyService;
import services.MoneyService;


public class Main {

    public static void main(String[] args) {

        IAccountRepository accountRepository = new AccountRepository();

        new Demo(accountRepository).fillData();
        IMoneyService moneyService = new MoneyService(accountRepository);

        for (Account account : accountRepository.getAllAccounts()) {
            System.out.println(account);
        }
        System.out.println("Do Stuff");

        moneyService.debitAccount(1, 25555);
        System.out.println(accountRepository.getAccountById(1));

        moneyService.creditAccount(2,3254);
        System.out.println(accountRepository.getAccountById(2));

        moneyService.transferMoney(2,1,1000);
        moneyService.transferMoney(1,3,1000);

        System.out.println();
        for (Account account : accountRepository.getAllAccounts()) {
            System.out.println(account);
        }
    }
}
