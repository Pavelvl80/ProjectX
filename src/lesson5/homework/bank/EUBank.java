package lesson5.homework.bank;

/**
 * Created by Edvard Piri on 05.09.2016.
 */
public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        int withdrawal = 0;
        switch (getCurrency()) {
            case USD:
                withdrawal = 2000;
                break;
            case EUR:
                withdrawal = 2200;
                break;
        }
        return withdrawal;
    }

    @Override
    public int getLimitOfFunding() {
        int limit = 0;
        switch (getCurrency()) {
            case USD:
                limit = 10000;
                break;
            case EUR:
                limit = 20000;
                break;
        }
        return limit;
    }

    @Override
    public int getMonthlyRate() {
        int rate = 0;
        switch (getCurrency()) {
            case USD:
                rate = 0;
                break;
            case EUR:
                rate = 1;
        }
        return 0;
    }

    @Override
    public int getCommission(int amount) {
        int commission = 0;
        switch (getCurrency()) {
            case USD:
                commission = amount > 1000 ? 5 : 7;
                break;
            case EUR:
                commission = amount > 1000 ? 2 : 4;
        }
        return commission;
    }

    @Override
    public double moneyPaidMonthlyForSalary() {
        return 2000;
    }
}