package dao.repository;

import dto.entity.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountRepositoryTwo implements IAccountRepository {

    @Override
    public Account getAccountById(long id) {
        return new Account(1L, "Ivan", 10235);
    }

    @Override
    public void addAccount(Account account) {

    }

    @Override
    public List<Account> getAllAccounts() {
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1L, "Ivan", 10235));
        return accounts;
    }
}
