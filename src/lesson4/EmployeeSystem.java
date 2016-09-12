package lesson4;

import java.util.ArrayList;

/**
 * Created by Edvard Piri on 11.09.2016.
 */
public class EmployeeSystem {

    void setAllEmployeesSalary(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary(employees[i].calculateSalary());
        }
    }

    void getEmpBiggestSalary(Employee[] employees) {
        int max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (max < employees[i].getSalary()) max = employees[i].getSalary();
        }
        System.out.println(max);
    }

    void getEmpNames(Employee[] employees) {
        String[] names = new String[5];
        for (int i = 0; i < 5; i++) {
            names[i] = employees[i].getName();
            System.out.print(names[i] + " ");
        }
    }

    void getEmpThreeMinSalary(Employee[] employees) {
        int m1 = Integer.MAX_VALUE;
        int m2 = Integer.MAX_VALUE;
        int m3 = Integer.MAX_VALUE;

        System.out.println("\b");
        for (int i = 0; i < employees.length; i++) {
            if (m1 > employees[i].getSalary()) {
                m1 = employees[i].getSalary();
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > m1 && employees[i].getSalary() < m2) {
                m2 = employees[i].getSalary();
            }
        }
        for(int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > m2 && employees[i].getSalary() < m3) {
                m3 = employees[i].getSalary();
            }
        }
        System.out.println(m1 + " " + m2 + " " + m3);
    }
}