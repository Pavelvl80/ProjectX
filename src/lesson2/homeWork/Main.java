package lesson2.homeWork;

/**
 * Created by Edvard Piri on 03.09.2016.
 */
public class Main {
    public static void main(String[] args) {

        User user = new User("John", 10000, 5, "Google", 3000, "Dollars");

        user.paySalary(1000);

        System.out.println(user.salary);

        System.out.println(user.balance);

        System.out.println(user.withdraw(100));

        System.out.println(user.balance);

        System.out.println(user.companyNameLength());

        System.out.println(user.monthsOfEmployment);

        user.monthIncreaser(1);

        System.out.println(user.monthsOfEmployment);
    }
}
