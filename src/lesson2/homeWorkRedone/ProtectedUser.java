package lesson2.homeWorkRedone;

/**
 * Created by Edvard Piri on 04.09.2016.
 */
public class ProtectedUser {

    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
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

    void paySalary(int salary) {
        this.salary += salary;
    }

    int withdraw(int summ) {
        balance -= summ;
        if (summ <= 1000) {
            summ = (int) summ - ((summ * 5) / 100);
        } else {
            summ = (int) summ - ((summ * 10) / 100);
        }
        return summ;
    }

    int companyNameLength() {
        return companyName.length();
    }

    void monthIncreaser(int addMonth) {
        monthsOfEmployment += addMonth;
    }
}


