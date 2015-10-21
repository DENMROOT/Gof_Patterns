package state.model;

import org.junit.Test;
import state.model.impl.FlightType;
import state.model.impl.MessageStatus;
import state.model.impl.NotificationObject;
import state.model.impl.observers.WidgetUser;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by DENM on 21.10.2015.
 */
public class StateTest {
    @Test
    public void StateTest(){
        Subject subject = new NotificationObject(new ArrayList<Observer>(), "Flight notification center");

        Observer widgetObserver = new WidgetUser(subject,"Widget user");
        widgetObserver.subscribe();

        Observer informationBoard = new WidgetUser(subject,"InformationBoard");
        informationBoard.subscribe();

        ((Notification)subject).setDesc("Flight 1 delayed", FlightType.REGULAR);
        ((Notification)subject).deliver();
        assertEquals(MessageStatus.DELIVERED, ((Notification) subject).getStatus());

        ((Notification)subject).cancel();
        assertEquals(MessageStatus.REJECTED,((Notification) subject).getStatus());

        ((Notification)subject).reDeliver();
        assertEquals(MessageStatus.NEW, ((Notification) subject).getStatus());

    }
}
