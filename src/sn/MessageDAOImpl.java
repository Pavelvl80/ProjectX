package sn;

/**
 * Created by Edvard Piri on 13.10.2016.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MessageDAOImpl implements MessageDAO {

    private static List<Message> messages = new ArrayList<>();


    @Override
    public Message save(Message message) {
        messages.add(message);
        return message;
    }

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
}
