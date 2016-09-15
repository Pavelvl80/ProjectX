package lesson4.homework;

import java.util.Arrays;

/**
 * Created by Edvard Piri on 10.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        EmployeeSystem employeeSystem = new EmployeeSystem();

        Employee managareEmployee1 = new ManagareEmployee(111, "Ron", 35, 100, 200);
        Employee managareEmployee2 = new ManagareEmployee(112, "Rod", 36, 200, 150);
        Employee managareEmployee3 = new ManagareEmployee(113, "Ross", 37, 300, 300);
        Employee devoloperEmployee1 = new DeveloperEmployee(121, "John", 23, 200, 10, 3, 15);
        Employee devoloperEmployee2 = new DeveloperEmployee(121, "Jinn", 24, 300, 4, 2, 10);
        Employee devoloperEmployee3 = new DeveloperEmployee(121, "Jerry", 25, 400, 30, 8, 10);
        Employee[] employees = {managareEmployee1, managareEmployee2, managareEmployee3, devoloperEmployee1, devoloperEmployee2, devoloperEmployee3};

        employeeSystem.setAllEmployeesSalary(employees);

        employeeSystem.getEmpBiggestSalary(employees);
        employeeSystem.getEmpNames(employees);
        employeeSystem.getEmpMinSalary(employees, 4);


    }
}
