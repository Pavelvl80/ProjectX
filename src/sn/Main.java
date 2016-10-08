package sn;

/**
 * Created by Edvard Piri on 06.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        UserController controller = new UserController();

        User user = new User("Roman", "123", Gender.MALE, "Kiev");
        User user1 = new User("Dima", "123", Gender.MALE, "Kiev");
        User user2 = new User("Roman", "123", Gender.MALE, "Kiev");
        User user3 = new User("Dima", "123", Gender.MALE, "Kiev");

        try {
            controller.register(user);
            controller.register(user1);
//            controller.register(user1);
        } catch (Exception e) {
            System.err.println("two same users");
        }

        //TODO fix duplicates/ FIXED
        System.out.println(controller.getUsers());

        //controller.addToFriend(user, user1);

        System.out.println(controller.getUsers());

    }
}
