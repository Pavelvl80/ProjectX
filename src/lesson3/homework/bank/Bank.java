package lesson3.homework.bank;

/**
 * Created by Edvard Piri on 05.09.2016.
 */
public abstract class Bank {
    private long id;
    private String bankCountry;
    private String currency;
    private int numberOfEmployees;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    public Bank() {
    }

    Bank(long id, String bankCountry, String currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    //METHODS----------------------------------------

    public abstract int getLimitOfWithdrawal();

    public abstract int getLimitOfFunding();

    public abstract int getMonthlyRate();

    public abstract int getCommission(int amount);

    public abstract double moneyPaidMonthlyForSalary();

    //GETTERS-SETTERS---------------------------------

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }
}


