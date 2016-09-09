package lesson3.homeWork;

/**
 * Created by Edvard Piri on 05.09.2016.
 */
public class BankSystem {


    void withdrawOfUser(User user, int amount) {
        double balance = user.getBalance();
        long total = user.getBank().getTotalCapital();
        int commission = user.getBank().getCommission();

        if (amount > 1000) commission += 2;
        commission = (amount * user.getBank().getCommission()) / 100;

        if (amount > 0) {
            if (user.getBank().getLimitOfWithdrawal() >= amount) {
                if (user.getBalance() >= (amount + commission)) {

                    balance -= amount;
                    amount -= commission;
                    total -= amount;

                    user.setBalance(balance);
                    user.getBank().setTotalCapital(total);

                    System.out.println("Your balance is: " + user.getBalance() + ", commission: " + commission);

                } else {
                    System.out.println("Not enough money on your balance");
                }
            } else {
                System.out.println("Limit of your amount is " + user.getBank().getLimitOfWithdrawal());
            }
        } else {
            System.out.println("Amount has to be bigger than zero");
        }
    }

    void fundUser(User user, int amount) {
        double balance = user.getBalance();
        long total = user.getBank().getTotalCapital();
        int commission = user.getBank().getCommission();

        if (amount > 1000) commission += 2;
        commission = (amount * user.getBank().getCommission()) / 100;

        if (amount > 0) {
            if (amount <= user.getBank().getLimitOfFunding()) {

                total += amount;
                amount -= commission;
                balance += amount;

                user.setBalance(balance);
                user.getBank().setTotalCapital(total);

                System.out.println("Your balance is: " + user.getBalance() + ", commission: " + commission);

            } else {
                System.out.println("Limit of your amount is " + user.getBank().getLimitOfFunding());
            }
        } else {
            System.out.println("Amount has to be bigger than zero");
        }
    }

    void transferMoney(User fromUser, User toUser, int amount) {
        double fromBalance = fromUser.getBalance();
        double toBalance = toUser.getBalance();

        long fromTotal = fromUser.getBank().getTotalCapital();
        long toTotal = toUser.getBank().getTotalCapital();
        int commission = fromUser.getBank().getCommission();

        if (amount > 1000) commission += 2;
        commission = (amount * fromUser.getBank().getCommission()) / 100;

        if (fromUser.getBank().getCurrency() == toUser.getBank().getCurrency()) {
            if (amount > 0) {
                if (fromUser.getBalance() > (amount + commission)) {

                    fromBalance -= amount;
                    amount -= commission;
                    toBalance += amount;

                    fromUser.setBalance(fromBalance);
                    toUser.setBalance(toBalance);

                    if (fromUser.getBank().getId() != toUser.getBank().getId()) {
                        fromTotal -= amount;
                        toTotal += amount;

                        fromUser.getBank().setTotalCapital(fromTotal);
                        toUser.getBank().setTotalCapital(toTotal);
                    }

                    System.out.println("Sent: " + amount +
                            "\nYour balance is: " + fromUser.getBalance() +
                            "\nCommission = " + commission);

                } else {
                    System.out.println("Not enough money on your balance");
                }
            } else {
                System.out.println("Amount has to be bigger than zero");
            }
        } else {
            System.out.println("Cannot send "
                    + fromUser.getBank().getCurrency() +
                    " to " + toUser.getBank().getCurrency() +
                    ". Funds must be in the same currency");
        }
    }

    void paySalary(User user) {
        double balance = user.getBalance();
        double salary = user.getBank().moneyPaidMonthlyForSalary();

        if (salary > 0) {

            balance += salary;
            user.setBalance(balance);
        }
    }
}
