package sn;

public class MessagesController {
    private UserDAO userDAO = new UserDAOImpl();

    private MessageDAO messageDAO = new MessageDAOImpl();


    Message sendMessage(User fromUser, User toUser, String msg) throws Exception {
        if (!fromUser.isLogged()) throw new Exception("you are is not logged in");

        Message message = new Message(101, msg, fromUser, toUser);

        messageDAO.save(message);

        return message;
    }


    public MessageDAO getMessageDAO(User user) {
        return messageDAO;
    }
}