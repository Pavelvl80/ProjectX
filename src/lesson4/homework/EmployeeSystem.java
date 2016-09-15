package lesson4.homework;

/**
 * Created by Edvard Piri on 11.09.2016.
 */
public class EmployeeSystem {

    int[] getEmpsSalary(Employee[] employees) {
        int[] salary = new int[employees.length];
        for (int i = 0; i < employees.length; i++) {
            salary[i] = employees[i].getSalary();
        }
        return salary;
    }

    int[] getEmpsBubbleSortSalary(Employee[] employees) {
        int[] salary = getEmpsSalary(employees);

        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees.length - 1; j++) {
                if (salary[i] < salary[j]) {
                    int box = salary[i];
                    salary[i] = salary[j];
                    salary[j] = box;
                }
            }
        }
        return salary;
    }

    int[] getEmpsInsertSortSalary(Employee[] employees) {
        int[] salary = getEmpsSalary(employees);

        int key;
        int index = 0;
        for (int j = 0; j < employees.length; j++) {
            int elem = salary[j];
            index = j - 1;
            while (index > 0 && salary[index] > elem) {
                salary[index + 1] = salary[index];
                index = index - 1;
                salary[index + 1] = elem;
            }
        }
        return salary;
    }

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

    void getEmpMinSalary(Employee[] employees, int num) {
        int[] salary = getEmpsBubbleSortSalary(employees);
        int minSalary = 0;
        int i;

        System.out.println("\b");

        for (i = 0; i < num; i++) {
            if (minSalary == salary[i]) {
                num++;
            } else {
                minSalary = salary[i];
                System.out.print(minSalary + " ");
            }
        }
    }
}