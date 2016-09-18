package lesson5.homework.bank;

/**
 * Created by Edvard Piri on 19.09.2016.
 */
public interface BankSystemInterface {

    void withdrawOfUser(User user, int amount);

    void fundUser(User user, int amount);

    void transferMoney(User fromUser, User toUser, int amount);

    void paySalary(User user);
}

