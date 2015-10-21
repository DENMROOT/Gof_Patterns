package state.model.impl.mso;

import state.model.MessageStatusOperations;
import state.model.impl.MessageStatus;
import state.model.impl.NotificationObject;
import state.model.impl.UnsupportedStatusTransitionException;

/**
 * Created by dmakarov on 10/21/2015.
 */
public class NewMso implements MessageStatusOperations {

    @Override
    public MessageStatus deliver(NotificationObject reservation) {
        return MessageStatus.DELIVERED;
    }

    @Override
    public MessageStatus cancel(NotificationObject reservation) {
        return MessageStatus.REJECTED;
    }

    @Override
    public MessageStatus reDeliver(NotificationObject reservation) throws UnsupportedStatusTransitionException {
        throw new UnsupportedStatusTransitionException("status change in NEW to NEW status is not suppoted");
    }
}
