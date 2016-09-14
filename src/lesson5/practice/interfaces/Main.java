package lesson5.practice.interfaces;

/**
 * Created by Edvard Piri on 14.09.2016.
 */
public class Main {

    public static void main(String[] args) {



        City city1 = new City(1023, "Krakow");
        City city2 = new City(1023, "Kiev");
        City city3 = new City(1023, "Kharkow");

        City[] cities = {city1, city2, city3};

        System.out.println(city1.toString());


        //interface usage example
        DBService dbService = new DBUserService();

        saveArrayToDB(cities, new DBUserService());


    }

    static void saveArrayToDB(Object[] users, DBService dbService) {
        for (Object user : users) {
            dbService.save(user);
        }
    }

}
