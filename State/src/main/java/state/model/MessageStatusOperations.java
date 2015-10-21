package state.model;

import state.model.impl.MessageStatus;
import state.model.impl.NotificationObject;
import state.model.impl.UnsupportedStatusTransitionException;

/**
 * Created by dmakarov on 10/21/2015.
 */
public interface MessageStatusOperations {
    MessageStatus deliver(NotificationObject reservation) throws UnsupportedStatusTransitionException;
    MessageStatus cancel(NotificationObject reservation) throws UnsupportedStatusTransitionException;
    MessageStatus reDeliver(NotificationObject reservation) throws UnsupportedStatusTransitionException;
}
