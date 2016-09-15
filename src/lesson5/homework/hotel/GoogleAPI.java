package lesson5.homework.hotel;

/**
 * Created by Edvard Piri on 15.09.2016.
 */
public class GoogleAPI implements API {
    Room[] rooms;

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return null;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
