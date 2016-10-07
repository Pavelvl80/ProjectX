package sn;

/**
 * Created by Edvard Piri on 06.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        UserController controller = new UserController();

        User user = new User("Roman", "123", Gender.MALE, "Kiev");
        User user1 = new User("Dima", "123", Gender.MALE, "Kiev");

        controller.register(user);
        controller.register(user1);

        //TODO fix duplicates
        controller.register(user);
        controller.register(user1);
        System.out.println(controller.getUsers());
    }
}
