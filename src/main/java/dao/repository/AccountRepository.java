package dao.repository;

import dto.entity.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository implements IAccountRepository {

    private List<Account> accountList = new ArrayList<>();

    public Account getAccountById(long id) {
        for (Account account : accountList) {
            if (account.getId() == id) {
                return account;
            }
        }
        return null;
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public List<Account> getAllAccounts() {
        return accountList;
    }
}
