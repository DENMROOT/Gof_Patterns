package mediator.model;

import java.util.List;

/**
 * Created by dmakarov on 10/8/2015.
 */
public interface ChatMediator {
    public void sendMessage(String message, User user);
    void addUser(User user);
    void addUserList(List<User> users);
    void removeUser(User user);
}
