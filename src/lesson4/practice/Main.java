package lesson4.practice;

/**
 * Created by Edvard Piri on 14.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new DeveloperEmployee(100, 50, "Jack");
        employee.paySalary();

        DeveloperEmployee developerEmployee = new DeveloperEmployee(100, 50, "Test");
        developerEmployee.paySalary();
    }

    int getBonuses(Employee employee) {
        return employee.getBonuses();
    }
}