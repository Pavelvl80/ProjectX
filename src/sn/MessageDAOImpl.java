package sn;

import java.util.ArrayList;
import java.util.List;

public class MessageDAOImpl extends AbstractDAOImpl<Message> implements MessageDAO {

    private static List<Message> messages = new ArrayList<>();



    //    @Override
//    public Message save(Message message) {
//        messages.add(message);
//        return message;
//    }

    @Override
    public List<Message> getByUserId(long id) {
        List<Message> res = new ArrayList<>();

        //select * from users where user.is != 101

        for (Message message : messages) {
            if (message.getFromUser().getId() == id
                    || message.getToUser().getId() == id) res.add(message);
        }

        return res;
    }

    @Override
    public List<Message> getByUser(User user) {
        return null;
    }

    @Override
    public List<Message> getAll() {
        return messages;
    }
}