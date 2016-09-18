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


    Room[] requestRooms(int price, int persons, String city, String hotel) {
        Room[] rooms = new Room[getSizeRooms(price, persons, city, hotel)];
        int all = 0;

        for (int i = 0; i < apis.length; i++) {
            for (int j = 0; j < apis[i].findRooms(price, persons, city, hotel).length; j++) {
                rooms[all] = apis[i].findRooms(price, persons, city, hotel)[j];
                all++;
            }
        }

        return nullDeleter(rooms);
    }

    Room[] check(API api1, API api2) {
        Room[] apiRooms1 = api1.getAll();
        Room[] apiRooms2 = api2.getAll();
        int size = apiRooms1.length + apiRooms2.length;
        Room[] rooms = new Room[size];

        for (int j = 0; j < apiRooms1.length; j++) {
            for (int i = 0; i < apiRooms2.length; i++) {
                if (apiRooms1[j].equals(apiRooms2[i])) {
                    rooms[i] = apiRooms1[i];
                }
            }
        }
        return nullDeleter(rooms);
    }


    Room[] nullDeleter(Room[] rooms) {
        int a = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) a++;
        }
        Room[] roomsOutNulls = new Room[a];
        a = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                roomsOutNulls[a] = rooms[i];
                a++;
            }
        }
        return roomsOutNulls;
    }


}
