package lesson5.homework.hotel;

import java.util.Arrays;

/**
 * Created by Edvard Piri on 15.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        API bookingComApi = new BookingComAPI();
        API tripAdvisorAPI = new TripAdvisorAPI();

        // Sys.out.println(Arrays.asList(controller.requestRooms(100, 2, "kiev", "kiev's hotel")));

        // Sys.out.println(Arrays.asList(bookingComApi.getAll()));

        // Sys.out.println(Arrays.asList(bookingComApi.findRooms(100, 2, "kiev", "kiev's hotel")));

        System.out.println(Arrays.asList(controller.check(bookingComApi, tripAdvisorAPI)));

        // Sys.out.println(Arrays.asList(controller.requestRooms(100, 2, "kiev", "kiev's hotel")));
    }
}
