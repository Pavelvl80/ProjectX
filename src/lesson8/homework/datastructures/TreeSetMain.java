package lesson8.homework.datastructures;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Edvard Piri on 01.10.2016.
 */
public class TreeSetMain {
    public static void main(String[] args) {

        User user1 = new User(333123, "Jack", "Smith", "Krakow", 3000);
        User user2 = new User(333124, "Leroy", "Jenkins", "London", 3000);
        User user3 = new User(333125, "Jack", "Smith", "Kiev", 3000);
        User user4 = new User(333126, "Jack", "Smith", "Kiev", 3000);
        User user5 = new User(333127, "Jack", "Petrov", "Krakow", 3000);
        User user6 = new User(333128, "Jack", "Smith", "London", 3000);
        User user7 = new User(333129, "Jack", "Smith", "London", 3000);
        User user8 = new User(333133, "Jack", "Smith", "Kiev", 3000);
        User user9 = new User(333143, "Jack", "Smith", "Krakow", 3000);
        User user10 = new User(333133, "Jack", "Smith", "Kiev", 3000);

        Order order1 = new Order(871234, 100, Currency.USD, "Mystery box of mystery", "EmptyBox", user1);
        Order order2 = new Order(871234, 100, Currency.USD, "Mystery box of mystery", "EmptyBox", user3);
        Order order3 = new Order(871234, 100, Currency.USD, "Mystery box of mystery", "EmptyBox", user3);
        Order order4 = new Order(871234, 500, Currency.USD, "Mystery box of mystery", "EmptyBox", user4); //Duplicates
        Order order5 = new Order(871234, 500, Currency.USD, "Mystery box of mystery", "EmptyBox", user4); //Duplicates
        Order order6 = new Order(871234, 700, Currency.EUR, "Mystery box of mystery", "EmptyBox6", user6);
        Order order7 = new Order(871234, 800, Currency.EUR, "fMystery box of mystery", "EmptyBox7", user7);
        Order order8 = new Order(871234, 900, Currency.EUR, "gMystery box of mystery", "EmptyBox8", user8);
        Order order9 = new Order(871234, 1100, Currency.EUR, "Mystery box of mystery", "EmptyBox9", user9);
        Order order10 = new Order(871234, 1000, Currency.EUR, "Mystery box of mystery", "EmptyBox10", user10);
//        Order order1 = new Order(871234, 100, Currency.USD, "Mystery box of mystery", "EmptyBox");
//        Order order2 = new Order(871234, 300, Currency.USD, "Mystery box of mystery", "EmptyBox");
//        Order order3 = new Order(871234, 100, Currency.USD, "Mystery box of mystery", "EmptyBox");
//        Order order4 = new Order(871234, 500, Currency.USD, "Mystery box of mystery", "EmptyBox"); //Duplicates
//        Order order5 = new Order(871234, 500, Currency.USD, "Mystery box of mystery", "EmptyBox"); //Duplicates
//        Order order6 = new Order(871234, 700, Currency.EUR, "Mystery box of mystery", "EmptyBox6");
//        Order order7 = new Order(871234, 800, Currency.EUR, "fMystery box of mystery", "EmptyBox7");
//        Order order8 = new Order(871234, 900, Currency.EUR, "gMystery box of mystery", "EmptyBox8");
//        Order order9 = new Order(871234, 1100, Currency.EUR, "Mystery box of mystery", "EmptyBox9");
//        Order order10 = new Order(871234, 1000, Currency.EUR, "Mystery box of mystery", "EmptyBox10");

        Set<Order> treeSet = new TreeSet<>();
        treeSet.add(order1);
        treeSet.add(order2);
        treeSet.add(order3);
        treeSet.add(order4);
        treeSet.add(order5);
        treeSet.add(order6);
        treeSet.add(order7);
        treeSet.add(order8);
        treeSet.add(order9);
        treeSet.add(order10);


        /** - check if set contain Order where User’s lastName is - “Petrov” */
//        treeSet.forEach(order -> {
//            if (order.getUser().getLastName().equals("Petrov")) System.out.println("I SEE YOU, PETROV");
//        });

        /**- print Order with largest price using only one set method - get. у SETов нет метода get, не пойму задание  */

        /**- delete orders where currency is USD using Iterator*/
        Iterator<Order> itr = treeSet.iterator();
        while (itr.hasNext()) {
            if (itr.next().getCurrency().equals(Currency.USD)) itr.remove();
        }

        System.out.println(treeSet);

    }
}
