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
        Room[] apiRooms1 = api1.getAll();
        Room[] apiRooms2 = api2.getAll();
        int size = apiRooms1.length + apiRooms2.length;
        Room[] rooms = new Room[size];

        for (int j = 0; j < apiRooms1.length; j++) {
            for (int i = 0; i < apiRooms2.length; i++) {
                if (apiRooms1[i] == apiRooms2[j]) {
                    rooms[i] = apiRooms1[i];
                }
            }
        }
        return rooms;
    }


}
//[Room{id=123654, price=100, persons=2, dateAvailableFrom=Thu Jan 01 01:00:02 CET 1970, hotelName='kiev's hotel', cityName='kiev'} не равны
//[Room{id=123654, price=100, persons=2, dateAvailableFrom=Thu Jan 01 01:00:02 CET 1970, hotelName='kiev's hotel', cityName='kiev'}