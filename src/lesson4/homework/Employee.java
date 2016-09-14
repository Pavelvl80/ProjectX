package lesson4.homework;

/**
 * Created by Edvard Piri on 10.09.2016.
 */
public abstract class Employee {
    private int id;
    private int salary;
    private String name;
    private int age;
    private int balance;

    public Employee(int id, String name, int age, int balance) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    //METHODS

    void paySalary() {
        balance += salary;
    }

    abstract int calculateSalary();


// GETTERS-SETTERS

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

    // TO STRING


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }
}

