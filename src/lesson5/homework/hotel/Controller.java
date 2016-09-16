package lesson5.homework.hotel;


/**
 * Created by Edvard Piri on 15.09.2016.
 */
public class Controller {
    API bookingComAPI = new BookingComAPI();
    API googleApi = new GoogleAPI();
    API tripAdvisorAPI = new TripAdvisorAPI();
    API[] apis = {bookingComAPI, googleApi, tripAdvisorAPI};

    int getSizeRooms(int price, int persons, String city, String hotel) {
        int size = 0;
        for (int i = 0; i < apis.length; i++) {
            size += apis[i].findRooms(price, persons, city, hotel).length;
        }
        return size;
    }

    /**
     * Room[] requestRooms(int price, int persons, String city, String hotel) {
     * Room[] rooms1 = bookingComAPI.findRooms(price, persons, city, hotel);
     * Room[] rooms2 = googleApi.findRooms(price, persons, city, hotel);
     * int size = rooms1.length + rooms2.length;
     * Room[] rooms = new Room[size];
     * <p>
     * for (int i = 0; i < rooms1.length; i++) {
     * rooms[i] = rooms1[i];
     * }
     * <p>
     * for (int i = rooms1.length; i < rooms2.length; i++) {
     * rooms[i] = rooms2[i];
     * }
     * <p>
     * return rooms;
     * }
     */

    Room[] requestRooms(int price, int persons, String city, String hotel) {
        Room[] rooms = new Room[getSizeRooms(price, persons, city, hotel)];
        int all = 0;

        for (int i = 0; i < apis.length; i++) {
            for (int j = 0; j < apis[i].findRooms(price, persons, city, hotel).length; j++) {
                if (apis[i].findRooms(price, persons, city, hotel)[j] != null) {
                    rooms[all] = apis[i].findRooms(price, persons, city, hotel)[j];
                    all++;
                }
            }
        }
        return rooms;
    }

    Room[] check(API api1, API api2) {
        Room[] apiRoom1 = api1.getAll();
        Room[] apiRoom2 = api2.getAll();
        int size = apiRoom1.length + apiRoom2.length;
        Room[] rooms = new Room[size];

        for (int i = 0; i > size; i++)
            if (apiRoom1[i] == apiRoom2[i]) {
                rooms[i] = apiRoom1[i];
            }
        return rooms;
    }


}
