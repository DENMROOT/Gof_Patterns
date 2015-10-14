package model.customImpl.Impl;

import model.customImpl.Commentary;
import model.customImpl.Observer;
import model.customImpl.Subject;

import java.util.List;

/**
 * Created by dmakarov on 10/8/2015.
 */
public class CommentaryObject implements Commentary, Subject {
    private final List<Observer> observers;
    private String desc;
    private final String subjectDetails;

    public CommentaryObject(List<Observer>observers,String subjectDetails){
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
            observer.update(desc);
        }

    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;
        notifyObservers();
    }
    @Override
    public String subjectDetails() {
        return subjectDetails;
    }
}
