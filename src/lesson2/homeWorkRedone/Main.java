package lesson2.homeWorkRedone;

/**
 * Created by Edvard Piri on 03.09.2016.
 */
public class Main {
    public static void main(String[] args) {


        User user = new User("John", 3000, 5, "Google", 3000, "Dollars");

        printer(user);

        user.paySalary(1000);
        user.monthIncreaser(1);
        System.out.println(user.withdraw(1100));

        printer(user);

    }

    static void printer(User user) {
        System.out.println("Salary: " + user.getSalary() + " " +  user.getCurrency());
        System.out.println("Balance: " + user.getBalance() + " " + user.getCurrency());
        System.out.println("Month of employment: " + user.getMonthsOfEmployment());
    }
}
