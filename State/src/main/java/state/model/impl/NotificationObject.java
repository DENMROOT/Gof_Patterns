package state.model.impl;

import state.model.Notification;
import state.model.Observer;
import state.model.Subject;

import java.util.List;

/**
 * Created by User on 19.10.2015.
 */
public class NotificationObject implements Subject,Notification {
    private final List<Observer> observers;
    private String desc;
    private FlightType flightType;
    private final String subjectDetails;
    private MessageStatus status = MessageStatus.NEW;

    public NotificationObject(List<Observer> observers, String subjectDetails){
        this.observers = observers;
        this.subjectDetails = subjectDetails;
    }
    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        observers.remove(index);

    }

    @Override
    public void notifyObservers() {
        System.out.println();
        for(Observer observer : observers){
            observer.update(desc, flightType);
        }

    }

    @Override
    public void setDesc(String desc, FlightType type) {
        this.desc = desc;
        this.flightType=type;
        notifyObservers();
    }
    @Override
    public String subjectDetails() {
        return subjectDetails;
    }

    public MessageStatus getStatus() {
        return status;
    }

    public void deliver() {
        setStatus(status.deliver(this));
    }

    public void cancel() {
        setStatus(status.cancel(this));
    }

    public void reDeliver() {
        setStatus(status.reDeliver(this));
    }

    public void setStatus(MessageStatus status) {
        if (status != null && status != this.status) {
            System.out.println(("Notification# " + desc + ": changing status from " +
                    this.status + " to " + status));
            this.status = status;
        }
    }
}
