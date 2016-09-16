package lesson5.homework.hotel;

/**
 * Created by Edvard Piri on 15.09.2016.
 */
public class Controller {

    API apis[] = new API[3];

    Room[] requestRooms(int price, int persons, String city, String hotel) {
        Room[] rooms = new Room[apis.length];
        for (int i = 0; i < apis.length; i++) {
            rooms[i] = apis[i].findRooms(price, persons, city, hotel);
        }
        return rooms;
    }

    Room[] check(API api1, API api2) {
        Room[] rooms = new Room[1];
        if (api1.getAll() == api2.getAll()) {
        }
        return null;
    }
}
