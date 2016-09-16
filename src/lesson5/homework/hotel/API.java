package lesson5.homework.hotel;

/**
 * Created by Edvard Piri on 15.09.2016.
 */
public interface API {
    Room findRooms(int price, int persons, String city, String hotel);
    Room[] getAll();

}
