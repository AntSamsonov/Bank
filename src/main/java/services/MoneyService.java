package services;

import dao.repository.IAccountRepository;
import dto.entity.Account;

public class MoneyService implements IMoneyService {

    private IAccountRepository accountRepository;

    public void debitAccount(long accountId, int sum) {
        Account account = accountRepository.getAccountById(accountId);
        account.setBalance(account.getBalance() + sum);
    }

    public boolean creditAccount(long accountId, int sum) {
        Account account = accountRepository.getAccountById(accountId);
        int balance = account.getBalance();
        if (balance < sum) {
            return false;
        }
        account.setBalance(balance - sum);
        return true;
    }

    public boolean transferMoney(long debitId, long creditId, int sum) {
        if (creditAccount(creditId, sum)) {
            debitAccount(debitId, sum);
            return true;
        }
        return false;
    }
}
