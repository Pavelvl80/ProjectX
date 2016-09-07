package lesson3.HomeWork;

/**
 * Created by Edvard Piri on 05.09.2016.
 */
public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, String currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal() {
        int withdrawal = 0;
        switch (getCurrency()) {
            case "USD":
                withdrawal = 2000;
                break;
            case "EUR":
                withdrawal = 2200;
                break;
        }
        return withdrawal;
    }

    public int getLimitOfFunding() {
        int limit = 0;
        switch (getCurrency()) {
            case "USD":
                limit = 10000;
                break;
            case "EUR":
                limit = 20000 ;
                break;
        }
        return limit;
    }

    public int getMonthlyRate() {
        int rate = 0;
        switch (getCurrency()) {
            case "USD":
                rate = 0;
                break;
            case "EUR":
                rate = 1;
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
                commission = 2;
        }
        return commission;
    }

    public double moneyPaidMonthlyForSalary() {
        return 2000;
    }
}
