package sn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edvard Piri on 06.10.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        UserController controller = new UserController();
        MessagesController msgController = new MessagesController();

        User user = new User(1001, "Roman", Gender.MALE, "123", "Kiev");
        User user1 = new User(1002, "Dima", Gender.MALE, "123pp", "Odessa");
        User user2 = new User(1003, "Rita", Gender.FEMALE, "1", "Odessa");

        System.out.println(controller.getUsers());

        controller.register(user);
        controller.register(user1);
        controller.register(user2);

        System.out.println(controller.getUsers());

        controller.addToFriend(user, user1);

        msgController.sendMessage(user, user1, "Привет !!!");
        msgController.sendMessage(user1, user, "Пока! ");

        System.out.println(controller.getUsers());

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        users.add(user2);


//        msgController.getMessageDAO().getByUserId(user.getId());
        List<Message> list = controller.outboxMessages(1001);

        System.out.println(msgController.getMessageDAO());

        System.out.println(list);
//        make at least 3 tests
//        System.out.println(controller.getMessageByUsers(users));
//
//        System.out.println("test");
    }
}
