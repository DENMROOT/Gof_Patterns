package model;

import model.impl.ChatMediatorImpl;
import model.impl.UserImpl;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dmakarov on 10/8/2015.
 */
public class MediatorTest {
    @Test
    public void MediatorTest(){

        ChatMediator chat = new ChatMediatorImpl();
        User user_1 = new UserImpl(chat, "User_1");
        User user_2 = new UserImpl(chat, "User_2");
        User user_3 = new UserImpl(chat, "User_3");
        List<User> users = Arrays.asList(user_1, user_2, user_3);

        chat.addUserList(users);

        users.get(0).send("Hello Everybody!!!");

        chat.removeUser(users.get(1));

        users.get(2).send("12 monkeys sit on the tree, one fall ... 11 monkeys sit on the tree!!!");
    }
}
