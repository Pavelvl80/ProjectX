package lesson2;

/**
 * Created by Edvard Piri on 01.09.2016.
 */
public class User {
    long ID;
    String name;
    int salary;
    Company company;

    public User(long ID) {
        this.ID = ID;
    }

    public User(long ID, String name, int salary, Company company) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
        this.company = company;
    }

    void printCompany() {
        System.out.println(company.name);
    }
    void changeSalary (int delta, boolean isIncrease) {
        if (isIncrease) salary += delta;
        else salary -= delta;
    }


}
