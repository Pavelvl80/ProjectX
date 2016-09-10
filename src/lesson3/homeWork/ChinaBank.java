package lesson3.homeWork;

/**
 * Created by Edvard Piri on 05.09.2016.
 */
public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, String currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
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

    public int getCommission(int amount) {
        int commission = 0;
        switch (getCurrency()) {
            case "USD":
                if(amount < 1000)
                    commission = (amount * 3) / 100;
                else commission = (amount * 5) / 100;
                break;
            case "EUR":
                if(amount < 1000)
                    commission = (amount * 10) / 100;
                else commission = (amount * 11) / 100;
        }
        return commission;
    }

    public double moneyPaidMonthlyForSalary() {
        return 3000;
    }
}
