package lesson5.practice.enums;

/**
 * Created by Edvard Piri on 14.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        MoneyConverter moneyConverter1 = new MoneyConverter("london", 100, Currency.EUR);
        MoneyConverter moneyConverter2 = new MoneyConverter("Kiev", 100, Currency.PLN);
        MoneyConverter moneyConverter3 = new MoneyConverter("Krakow", 100, Currency.USD);

        System.out.println(moneyConverter1);
        System.out.println(moneyConverter2);
        System.out.println(moneyConverter3);

        Currency currency = Currency.valueOf("USD");
        System.out.println(currency);
    }
}
