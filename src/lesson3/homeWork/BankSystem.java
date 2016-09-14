package lesson3.homeWork;

/**
 * Created by Edvard Piri on 05.09.2016.
 */
public class BankSystem {


    void withdrawOfUser(User user, int amount) {
        double balance = user.getBalance();
        long total = user.getBank().getTotalCapital();
        int commission = user.getBank().getCommission(amount);

        if (user.getBank().getLimitOfWithdrawal() >= amount && user.getBalance() >= (amount + commission)) {

            balance -= amount;
            amount -= commission;
            total -= amount;

            user.setBalance(balance);
            user.getBank().setTotalCapital(total);
        }
    }

    void fundUser(User user, int amount) {
        double balance = user.getBalance();
        long total = user.getBank().getTotalCapital();
        int commission = user.getBank().getCommission(amount);

        if (amount <= user.getBank().getLimitOfFunding()) {

            total += amount;
            amount -= commission;
            balance += amount;

            user.setBalance(balance);
            user.getBank().setTotalCapital(total);
        }
    }


    void transferMoney(User fromUser, User toUser, int amount) {
        double fromBalance = fromUser.getBalance();
        double toBalance = toUser.getBalance();

        long fromTotal = fromUser.getBank().getTotalCapital();
        long toTotal = toUser.getBank().getTotalCapital();
        int commission = fromUser.getBank().getCommission(amount);

        if (fromUser.getBalance() > (amount + commission)) {

            fromBalance -= amount;
            amount -= commission;
            toBalance += amount;

            fromUser.setBalance(fromBalance);
            toUser.setBalance(toBalance);
        }

    }


    void paySalary(User user) {
        double balance = user.getBalance();
        double salary = user.getBank().moneyPaidMonthlyForSalary();

        balance += salary;
        user.setBalance(balance);
    }
}
