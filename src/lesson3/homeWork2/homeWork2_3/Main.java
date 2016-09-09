package lesson3.homeWork2.homeWork2_3;

/**
 * Created by Edvard Piri on 09.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("Tirion", 1000, 12, "West Mountain Company", 3000, "USD");

        System.out.println(user.getBalance());
        user.paySalary();
        System.out.println(user.getBalance() + " BALANCE");
        System.out.println(user.withdraw(300));
        System.out.println(user.getBalance() + " BALANCE");
        System.out.println(user.withdraw(2000));
        System.out.println(user.getBalance() + " BALANCE");
    }
}
