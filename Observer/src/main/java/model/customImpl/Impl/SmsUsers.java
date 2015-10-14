package model.customImpl.Impl;

import model.customImpl.Observer;
import model.customImpl.Subject;

/**
 * Created by dmakarov on 10/8/2015.
 */
public class SmsUsers implements Observer {
    private Subject subject;
    private String desc;
    private String userInfo;

    public SmsUsers(String userInfo){
        this.userInfo = userInfo;
    }

    @Override
    public void update(String desc) {
        this.desc = desc;
        display();
    }

    private void display(){
        System.out.println("["+userInfo+"]: "+desc);
    }

    @Override
    public void subscribe(Subject subject) {
        if(subject==null){
            throw new IllegalArgumentException("No Publisher found.");
        }
        this.subject = subject;
        System.out.println("Subscribing "+userInfo+" to "+subject.subjectDetails()+" ...");
        this.subject.subscribeObserver(this);
        System.out.println("Subscribed successfully.");
    }

    @Override
    public void unSubscribe() {
        System.out.println("Unsubscribing "+userInfo+" from "+subject.subjectDetails()+" ...");
        this.subject.unSubscribeObserver(this);
        System.out.println("Unsubscribed successfully.");
    }
}
