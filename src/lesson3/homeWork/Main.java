package lesson3.homeWork;

/**
 * Created by Edvard Piri on 05.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        BankSystem bankSystem = new BankSystem();

        USBank usBank = new USBank(137863, "USA", "USD", 1200, 3000, 150, 10000000);
        EUBank euBank = new EUBank(897567, "EU", "EUR", 900, 2300, 140, 8000000);
        ChinaBank chinaBank = new ChinaBank(543802, "China", "USD", 4000, 1100, 130, 5000000);

        User user1 = new User(123654, "Jack", 4000, 6, "luxoft", 3000, usBank);
        User user2 = new User(789056, "Artur", 3000, 12, "GoogleEU", 2200, euBank);
        User user3 = new User(897653, "Li", 1200, 12, "FromSoftWare", 700, chinaBank);

        tester(user1, user2, user3);
        bankSystem.transferMoney(user1, user3, 300);
        tester(user1, user2, user3);

    }

    public static void tester(User user1, User user2, User user3) {
        System.out.println(user1.objectToString());
        System.out.println(user2.objectToString());
        System.out.println(user3.objectToString());
    }
}
