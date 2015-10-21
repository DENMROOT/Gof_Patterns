package state.model.impl;

import state.model.MessageStatusOperations;
import state.model.impl.mso.DeliveredMso;
import state.model.impl.mso.NewMso;
import state.model.impl.mso.RejectedMso;

/**
 * Created by dmakarov on 10/21/2015.
 */
public enum MessageStatus implements MessageStatusOperations {
    NEW(new NewMso()),
    DELIVERED (new DeliveredMso()),
    REJECTED (new RejectedMso());
    private final MessageStatusOperations operations;

    MessageStatus(MessageStatusOperations operations) {
        this.operations = operations;
    }

    @Override
    public MessageStatus deliver(NotificationObject notification) {
        return operations.deliver(notification);
    }

    @Override
    public MessageStatus cancel(NotificationObject notification) {
        return operations.cancel(notification);
    }

    @Override
    public MessageStatus reDeliver(NotificationObject notification) {
        return operations.reDeliver(notification);
    }
}
