package lesson2.practice;

/**
 * Created by Edvard Piri on 01.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Company company = new Company("luxoft", 12000, "IT");

        Company company1 = new Company("luxoft", 12000, "IT");


        User user = new User(1001, "Jack", 1000, company);
        user.printCompany();
        user.changeSalary(1000, true);

        System.out.println(user.salary);
        System.out.println(company);
        System.out.println(company1);
    }
}
