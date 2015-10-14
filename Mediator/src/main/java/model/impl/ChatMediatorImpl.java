package model.impl;

import model.ChatMediator;
import model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmakarov on 10/8/2015.
 */
public class ChatMediatorImpl implements ChatMediator {
    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<User>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (u!=user) {
                u.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void addUserList(List<User> users) {
        this.users.addAll(users);
    }

    @Override
    public void removeUser(User user) {
        this.users.remove(user);
    }
}