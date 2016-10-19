package sn;

import java.util.List;

public class MessagesController {
    private UserDAO userDAO = new UserDAOImpl();

    private MessageDAO messageDAO = new MessageDAOImpl();

    long id = 101;


    Message sendMessage(User fromUser, User toUser, String msg) throws Exception {
        if (!fromUser.isLogged()) throw new Exception("you are is not logged in");

        Message message = new Message(id, msg, fromUser, toUser);

        message.setMessageType(MessageType.OUT);

        messageDAO.save(message);
        id++;

        return message;
    }


    public List<Message> getMessageDAO() {
        return messageDAO.getAll();
    }
}