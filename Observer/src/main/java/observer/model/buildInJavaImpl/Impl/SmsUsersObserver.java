package observer.model.buildInJavaImpl.Impl;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by dmakarov on 10/8/2015.
 */
public class SmsUsersObserver implements Observer {
    private String desc;
    private final String userInfo;
    private Observable observable;

    public SmsUsersObserver(String userInfo){

        this.userInfo = userInfo;
    }

    public void subscribe(Observable observable) {
        this.observable = observable;
        System.out.println("Subscribing "+userInfo+" to "+((CommentaryObjectObservable)(observable)).subjectDetails()+" ...");
        this.observable.addObserver(this);
        System.out.println("Subscribed successfully.");
    }

    public void unSubscribe() {
        System.out.println("Unsubscribing "+userInfo+" to "+((CommentaryObjectObservable)(observable)).subjectDetails()+" ...");
        this.observable.deleteObserver(this);
        System.out.println("Unsubscribed successfully.");
    }

    @Override
    public void update(Observable o, Object arg) {
        desc = (String)arg;
        display();
    }

    private void display(){
        System.out.println("["+userInfo+"]: "+desc);
    }
}
