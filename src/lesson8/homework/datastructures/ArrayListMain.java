package lesson8.homework.datastructures;

import java.util.*;

/**
 * Created by Edvard Piri on 29.09.2016.
 */
public class ArrayListMain {
    public static void main(String[] args) {

        User user1 = new User(333123, "Jack", "Smith", City.London, 3000);
        User user2 = new User(333124, "Leroy", "Jenkins", City.Krakow, 3000);
        User user3 = new User(333125, "Jack", "Smith", City.Kiev, 3000);
        User user4 = new User(333126, "Jack", "Smith", City.Kiev, 3000);
        User user5 = new User(333127, "Jack", "Petrov", City.Krakow, 3000);
        User user6 = new User(333128, "Jack", "Smith", City.London, 3000);
        User user7 = new User(333129, "Jack", "Smith", City.London, 3000);
        User user8 = new User(333133, "Jack", "Smith", City.Kiev, 3000);
        User user9 = new User(333143, "Jack", "Smith", City.Krakow, 3000);
        User user10 = new User(333133, "Jack", "Smith", City.Kiev, 3000);

        Order order1 = new Order(871234, 100, Currency.USD, "0", "0", user1);
        Order order2 = new Order(871234, 300, Currency.USD, "0", "0", user2);
        Order order3 = new Order(871234, 100, Currency.USD, "0", "0", user3);
        Order order4 = new Order(871234, 500, Currency.USD, "Mystery box of mystery", "EmptyBox", user4);
        Order order5 = new Order(871234, 500, Currency.USD, "Mystery box of mystery", "EmptyBox", user5);
        Order order6 = new Order(871234, 700, Currency.EUR, "Mystery box of mystery", "EmptyBox6", user6);
        Order order7 = new Order(871234, 800, Currency.EUR, "fMystery box of mystery", "EmptyBox7", user7);
        Order order8 = new Order(871234, 900, Currency.EUR, "gMystery box of mystery", "EmptyBox8", user8);
        Order order9 = new Order(871234, 1100, Currency.EUR, "Mystery box of mystery", "EmptyBox9", user9);
        Order order10 = new Order(871234, 1000, Currency.EUR, "Mystery box of mystery", "EmptyBox10", user10);

        List<Order> arrayList = new ArrayList<>();
        arrayList.add(order1);
        arrayList.add(order2);
        arrayList.add(order3);
        arrayList.add(order4);
        arrayList.add(order5);
        arrayList.add(order6);
        arrayList.add(order7);
        arrayList.add(order8);
        arrayList.add(order9);
        arrayList.add(order10);

        System.out.println(arrayList);


        /**sort list by Order price in decrease order*/
        Collections.sort(arrayList, new Comparator<Order>() {
            @Override
            public int compare(Order order1, Order order2) {
//                Integer price1 = order1.getPrice();   :D
//                Integer price2 = order2.getPrice();
//                return price2.compareTo(price1);
                return order2.getPrice() - order1.getPrice();
            }
        });

        /**sort list by Order price in increase order AND User city*/
        Collections.sort(arrayList, new Comparator<Order>() {
            @Override
            public int compare(Order order1, Order order2) {
                if (order1.getPrice() < order2.getPrice()) return order1.getPrice() - order2.getPrice();
                return order1.getUser().getCity().compareTo(order2.getUser().getCity());
            }
        });

        /**sort list by Order itemName AND ShopIdentificator AND User city*/
        Collections.sort(arrayList, new Comparator<Order>() {
            @Override
            public int compare(Order order1, Order order2) {
                int result = order1.getItemName().compareTo(order2.getItemName());

                if (result != 0) return order1.getItemName().compareTo(order2.getItemName());

                if (result != 0) return order1.getShopIdentificator().compareTo(order2.getShopIdentificator());

                return order1.getUser().getCity().compareTo(order2.getUser().getCity());
            }
        });
        /**delete duplicates from the list*/
        //arrayList.removeIf(order -> Collections.frequency(arrayList, order) > 1);

        /**delete items where price less than 1500*/
        //arrayList.removeIf(order -> order.getPrice() < 1500);

        /**separate list for two list - orders in USD and UAH*/
        List<Order> usdList = new ArrayList<>();
        List<Order> eurList = new ArrayList<>();
        arrayList.forEach(order -> {
            if (order.getCurrency().equals(Currency.USD)) usdList.add(order);
            else eurList.add(order);
        });

        /** separate list for as many lists as many unique cities are in User*/
        List<Order> londonList = new ArrayList<>();
        List<Order> kievList = new ArrayList<>();
        List<Order> krakowList = new ArrayList<>();

        arrayList.forEach(order -> {
            switch (order.getUser().getCity()) {
                case Kiev:
                    kievList.add(order);
                    break;
                case London:
                    londonList.add(order);
                    break;
                case Krakow:
                    krakowList.add(order);

            }
        });


//        System.out.println(arrayList);
//        System.out.println(usdList);
//        System.out.println(eurList);
        System.out.println(krakowList);
        System.out.println(londonList);
        System.out.println(kievList);
    }
}
