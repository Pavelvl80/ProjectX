package sn;


import java.util.List;
import java.util.Map;

public class UserController {
    //db connection emul
    private UserDAO userDAO = new UserDAOImpl();

    //db connection emulator
    private MessageDAO messageDAO = new MessageDAOImpl();

    User login(String name, String password) throws Exception {
        User curUser = userDAO.get(name, password);

        if (curUser == null)
            throw new Exception("wrong username or password");

        userDAO.setLogin(curUser);

        return curUser;
    }

    void logout(User user) {
        userDAO.setLogin(user);
    }

    //json format
    User register(User user) throws Exception {
        //dbConnection.save(user)
        User savedUser = userDAO.save(user);

        if (savedUser == null) throw new Exception("user is not saved");

        user.setLogged(true);
        return user;
    }

    void addToFriend(User fromUser, User toUser) throws Exception {
        //bad option
        /*if(fromUser.isLogged()) {
            fromUser.getFriends().add(toUser);
            toUser.getFriends().add(fromUser);
        }
        else {
            throw new Exception("you are is not logged in");
        }*/

        if (!fromUser.isLogged()) throw new Exception("you are is not logged in");

        fromUser.getFriends().add(toUser);
        toUser.getFriends().add(fromUser);
    }


    List<Message> getMessages(long userId) {
        //if (!fromUser.isLogged()) throw new Exception("you are is not logged in");
        return messageDAO.getByUserId(userId);
    }


    Map<User, List<Message>> getMessageByUsers(long userId) {
        //TODO make implemetation

        return null;
    }

    List<Message> outboxMessages(long userId) {
        //TODO make implemetation

        return null;
    }

    List<Message> inboxMessages(long userId) {
        //TODO make implemetation

        return null;
    }


    //inclass
    //TODO inboxMessages/outboxMessages for time period




}