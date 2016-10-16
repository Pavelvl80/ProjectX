package sn;


import lesson8.homework.datastructures.Order;

import java.util.*;

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


    Map<User, List<Message>> getMessageByUsers(List<User> users ) {
        //TODO make implemetation
        //задание: разделить сообщения по юзерам (fromUser)
        Map<User, List<Message>> messages = new HashMap<>();
        List<Message> allMessages = messageDAO.getAll();
        allMessages.forEach(message -> messages.put(message.getFromUser(), null));

        for (Map.Entry<User, List<Message>> entry : messages.entrySet()) {
            ArrayList<Message> timeList = new ArrayList<>();
            for (Message message : allMessages) {
                if (message.getFromUser().equals(entry.getKey())) timeList.add(message);
            }
            entry.setValue(timeList);
        }
        return messages;
    }

    List<Message> outboxMessages(long userId) {
        //TODO make implemetation
        List<Message> allMessages = messageDAO.getByUserId(userId);
        List<Message> outBoxMessages = new ArrayList<>();

        allMessages.forEach(message -> {
            if(message.getMessageType() != null && message.getMessageType().equals(MessageType.OUT))
                outBoxMessages.add(message);
        });

        return outBoxMessages;
    }

    List<Message> inboxMessages(long userId) {
        //TODO make implemetation
        List<Message> allMessages = messageDAO.getByUserId(userId);
        List<Message> inBoxMessages = new ArrayList<>();

        allMessages.forEach(message -> {
            if(message.getMessageType() != null && message.getMessageType().equals(MessageType.IN))
                inBoxMessages.add(message);
        });
        return inBoxMessages;
    }


    //inclass
    //TODO inboxMessages/outboxMessages for time period

}