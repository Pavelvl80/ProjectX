package lesson3.HomeWork;

/**
 * Created by Edvard Piri on 05.09.2016.
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, String currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal() {
        int withdrawal = 0;
        switch (getCurrency()) {
            case "USD":
                withdrawal = 1000;
                break;
            case "EUR":
                withdrawal = 1200;
                break;
        }
        return withdrawal;
    }

    public int getLimitOfFunding() {
        int limit = 0;
        switch (getCurrency()) {
            case "USD":
                limit = Integer.MAX_VALUE;
                break;
            case "EUR":
                limit = 10000;
                break;
        }
        return limit;
    }

    public int getMonthlyRate() {
        int rate = 0;
        switch (getCurrency()) {
            case "USD":
                rate = 1;
                break;
            case "EUR":
                rate = 2;
        }
        return 0;
    }

    public int getCommission() {
        int commission = 0;
        switch (getCurrency()) {
            case "USD":
                commission = 5;
                break;
            case "EUR":
                commission = 6;
        }
        return commission;
    }

    public double moneyPaidMonthlyForSalary() {
        return  3000;
    }
}
