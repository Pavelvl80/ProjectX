package lesson7.practice;

/**
 * Created by Edvard Piri on 21.09.2016.
 */

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        User user = new User("Taras", 20, "TestInterface");

        //System.out.println(Arrays.deepToString(controller.findFilm(user, "Ben Gur")));

        //System.out.println(Arrays.deepToString(controller.findFilm(user, 50)));

        System.out.println(controller.findCheapestFilm());

    }
}