package lesson5.practice.enums;

/**
 * Created by Edvard Piri on 14.09.2016.
 */
public class MoneyConverter {
    private String city;
    private int maxAmount;
    private Currency currency;

    public MoneyConverter(String city, int maxAmount, Currency currency) {
        this.city = city;
        this.maxAmount = maxAmount;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "MoneyConverter{" +
                "city='" + city + '\'' +
                ", maxAmount=" + maxAmount +
                ", currency=" + currency +
                '}';
    }
}
