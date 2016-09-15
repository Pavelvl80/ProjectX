package lesson3.homework.bank;

/**
 * Created by Edvard Piri on 05.09.2016.
 */
public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, String currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);

    }

    @Override
    public int getLimitOfWithdrawal() {
        int withdrawal = 0;
        switch (getCurrency()) {
            case "USD":
                withdrawal = 100;
                break;
            case "EUR":
                withdrawal = 150;
                break;
        }
        return withdrawal;
    }

    @Override
    public int getLimitOfFunding() {
        int limit = 0;
        switch (getCurrency()) {
            case "USD":
                limit = 10000;
                break;
            case "EUR":
                limit = 5000;
                break;
        }
        return limit;
    }

    @Override
    public int getMonthlyRate() {
        int rate = 0;
        switch (getCurrency()) {
            case "USD":
                rate = 1;
                break;
            case "EUR":
                rate = 0;
        }
        return 0;
    }

    @Override
    public int getCommission(int amount) {
        int commission = 0;
        switch (getCurrency()) {
            case "USD":
                commission = amount > 1000 ? 3 : 5;
                break;
            case "EUR":
                commission = amount > 1000 ? 10 : 11;
        }
        return commission;
    }

    @Override
    public double moneyPaidMonthlyForSalary() {
        return 3000;
    }
}
