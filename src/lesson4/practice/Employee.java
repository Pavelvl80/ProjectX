package lesson4.practice;

/**
 * Created by Edvard Piri on 14.09.2016.
 */
public abstract class Employee {
    private int salary;
    private int balance;
    private String name;
    private int age;

    public Employee(int salary, int age, String name) {
        this.salary = salary;
        this.age = age;
        this.name = name;
    }

    void paySalary() {
        balance+=salary;
    }

    abstract int getBonuses();

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}