package lesson4.practice;

/**
 * Created by Edvard Piri on 14.09.2016.
 */
public class DeveloperEmployee extends Employee {
    public DeveloperEmployee(int salary, int age, String name) {
        super(salary, age, name);
    }

    @Override
    void paySalary() {
        setBalance(getBalance() + getSalary() + 1000);
    }

    @Override
    int getBonuses() {
        return 1000;
    }
}