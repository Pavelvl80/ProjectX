package lesson3.homeWork2.homeWork2_3;

/**
 * Created by Edvard Piri on 09.09.2016.
 */
public class User {
        private String name;
        private double balance;
        private int monthsOfEmployment;
        private String companyName;
        private int salary;
        private String currency;

        public User(String name, double balance, int monthsOfEmployment, String companyName, int salary, String currency) {
            this.name = name;
            this.balance = balance;
            this.monthsOfEmployment = monthsOfEmployment;
            this.companyName = companyName;
            this.salary = salary;
            this.currency = currency;
        }

        void paySalary() {
            balance += salary;
        }

        double withdraw(int summ) {
            double doubleSumm = summ;
            if (summ <= 1000) {
                doubleSumm = doubleSumm + ((doubleSumm * 5) / 100);
            } else {
                doubleSumm = doubleSumm + ((doubleSumm * 10) / 100);
            }
            balance -= doubleSumm;
            return doubleSumm;
        }

        int companyNameLength() {
            return companyName.length();
        }

        void monthIncreaser(int addMonth) {
            monthsOfEmployment += addMonth;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public int getMonthsOfEmployment() {
            return monthsOfEmployment;
        }

        public void setMonthsOfEmployment(int monthsOfEmployment) {
            this.monthsOfEmployment = monthsOfEmployment;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }
    }
