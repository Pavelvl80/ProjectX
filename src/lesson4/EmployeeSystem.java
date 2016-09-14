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
        int[] min = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        int[] salary = new int[employees.length];

        for (int i = 0; i < employees.length; i++) {
            salary[i] = employees[i].getSalary();
        }
        System.out.println("\b");
        for (int i = 0; i < salary.length; i++) {
            if (min[0] > salary[i]) {
                min[0] = salary[i];
            }
        }
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < salary.length; i++) {
                if (salary[i] > min[j] && salary[i] < min[j + 1]) {
                    min[j + 1] = salary[i];
                }
            }
        }
        System.out.println(min[0] + " " + min[1] + " " + min[2]);
    }
}