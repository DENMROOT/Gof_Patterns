package state.model.impl.mso;

import state.model.MessageStatusOperations;
import state.model.impl.MessageStatus;
import state.model.impl.NotificationObject;
import state.model.impl.UnsupportedStatusTransitionException;

/**
 * Created by dmakarov on 10/21/2015.
 */
public class DeliveredMso implements MessageStatusOperations {
    @Override
    public MessageStatus deliver(NotificationObject reservation) throws UnsupportedStatusTransitionException {
        throw new UnsupportedStatusTransitionException("status change in DELIVERED to DELIVERED status is not suppoted");
    }

    @Override
    public MessageStatus cancel(NotificationObject reservation) throws UnsupportedStatusTransitionException {
        return MessageStatus.REJECTED;
    }

    @Override
    public MessageStatus reDeliver(NotificationObject reservation) throws UnsupportedStatusTransitionException {
        throw new UnsupportedStatusTransitionException("status change in DELIVERED to NEW status is not suppoted");
    }
}
