package dao.repository;

import dto.entity.Account;

import java.util.List;

public interface IAccountRepository {

    Account getAccountById(long id);

    void addAccount(Account account);

    List<Account> getAllAccounts();

}
