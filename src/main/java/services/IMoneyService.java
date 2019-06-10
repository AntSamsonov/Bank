package services;

public interface IMoneyService {

    void debitAccount(long accountId, int sum);

    void creditAccount(long accountId, int sum);

    void transferMoney(long firstId, long secondId, int sum);

}