package state.model;

import state.model.impl.FlightType;
import state.model.impl.MessageStatus;

/**
 * Created by User on 19.10.2015.
 */
public interface Notification {
    void setDesc(String desc, FlightType status);
    void deliver();
    void cancel();
    void reDeliver();
    MessageStatus getStatus();
}
