package lesson4.homework;

/**
 * Created by Edvard Piri on 10.09.2016.
 */
public class ManagareEmployee extends Employee {
    int fixedSalary;

    public ManagareEmployee(int id, String name, int age, int balance, int fixedSalary) {
        super(id, name, age, balance);
        this.fixedSalary = fixedSalary;
    }

    @Override
    int calculateSalary() {
        return fixedSalary;
    }

    @Override
    void paySalary() {
        int k;
        setBalance(getSalary());
    }

}
