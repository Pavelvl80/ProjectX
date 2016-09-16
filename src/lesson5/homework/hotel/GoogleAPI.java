package lesson5.homework.hotel;

import java.util.Date;

/**
 * Created by Edvard Piri on 15.09.2016.
 */
public class GoogleAPI implements API {
    Date date = new Date(2001);
    Room room1 = new Room(123654, 100, 2, date, "kiev's hotel", "kiev");
    Room room2 = new Room(123655, 200, 4, date, "kiev's hotel", "kiev");
    Room room3 = new Room(123656, 300, 2, date, "moscow's hotel", "moscow");
    Room room4 = new Room(123657, 600, 4, date, "moscow's hotel", "moscow");
    Room room5 = new Room(123658, 250, 2, date, "berlin's hotel", "berlin");

    Room[] rooms = {room1, room2, room3, room4, room5};

    @Override
    public Room findRooms(int price, int persons, String city, String hotel) {
        Room foundRooms = null;
        for (int i = 0; i < rooms.length; i++) {
            if (price == rooms[i].getPrice() && persons == rooms[i].getPersons() && city == rooms[i].getCityName() && hotel == rooms[i].getHotelName()) {
                foundRooms = rooms[i];
            }
        }
        return foundRooms;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
