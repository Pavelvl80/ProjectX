package lesson2.homeWork;

/**
 * Created by Edvard Piri on 03.09.2016.
 */
public class User {

    String name;
    int balance;
    int monthsOfEmployment;
    String companyName;
    int salary;
    String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    void paySalary(int salary) {
        this.salary += salary;
    }

    int withdraw(int summ) {
        balance -= summ;
        if (summ <= 1000) {
            summ = (int) summ - ((summ * 5) / 100);
        } else {
            summ = (int) summ - ((summ * 10) / 100);
        }
        return summ;
    }

    int companyNameLength() {
        return companyName.length();
    }

    void monthIncreaser(int addMonth) {
        monthsOfEmployment += addMonth;
    }
}
