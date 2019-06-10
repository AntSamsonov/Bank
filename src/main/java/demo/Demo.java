package demo;

import dao.repository.IAccountRepository;
import dto.entity.Account;

public class Demo {

    private IAccountRepository accountRepository;

    public Demo(IAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void fillData() {
        accountRepository.addAccount(new Account(1L, "Ivan", 10235));
        accountRepository.addAccount(new Account(2L, "Petr", 3254));
        accountRepository.addAccount(new Account(3L, "Anton", 135));
        accountRepository.addAccount(new Account(4L, "Stas", 6365482));
    }

}
