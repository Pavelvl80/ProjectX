package sn;

/**
 * Created by Edvard Piri on 06.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        UserController controller = new UserController();

        User user = new User(1, "Roman", "123", Gender.MALE, "Kiev");
        User user1 = new User(2, "Dima", "123", Gender.MALE, "Kiev");
        User user2 = new User(3, "Roman", "123", Gender.MALE, "Kiev");
        User user3 = new User(1, "DIMAAAAAA", "123", Gender.MALE, "Kiev");


        controller.register(user);
        controller.register(user1);
        controller.register(user2);
        controller.register(user3);

        controller.addToFriend(user, user1);

        controller.deleteUser(user3);

        controller.changeActiveStatus(user2);

        controller.update(user3);

        System.out.println(controller.getUsers());

    }
}
