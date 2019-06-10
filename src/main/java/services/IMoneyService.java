package services;

public interface IMoneyService {

    void debitAccount(long accountId, int sum);

    boolean creditAccount(long accountId, int sum);

    boolean transferMoney(long debitId, long creditId, int sum);

}