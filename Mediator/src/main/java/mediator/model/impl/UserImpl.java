package mediator.model.impl;

import mediator.model.ChatMediator;
import mediator.model.User;

/**
 * Created by dmakarov on 10/8/2015.
 */
public class UserImpl extends User {
    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + ": Sending message= " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + ": Receiving message= " + message);
    }
}
