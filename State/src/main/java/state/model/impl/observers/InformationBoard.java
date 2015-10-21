package state.model.impl.observers;


import state.model.Observer;
import state.model.Subject;
import state.model.impl.FlightType;

/**
 * Created by User on 19.10.2015.
 */
public class InformationBoard implements Observer {
    private final Subject subject;
    private String desc;
    private FlightType type;
    private String userInfo;

    public InformationBoard(Subject subject, String userInfo){
        if(subject==null){
            throw new IllegalArgumentException("No Publisher found.");
        }
        this.subject = subject;
        this.userInfo = userInfo;
    }

    @Override
    public void update(String desc, FlightType type) {
        this.desc = desc;
        this.type=type;
        display();
    }

    private void display(){
        System.out.println("["+userInfo+"]: "+desc +" Fly type: " + type);
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribing "+userInfo+" to "+subject.subjectDetails()+" ...");
        this.subject.subscribeObserver(this);
        System.out.println("Subscribed successfully.");
    }

    @Override
    public void unSubscribe() {
        System.out.println("Unsubscribing "+userInfo+" to "+subject.subjectDetails()+" ...");
        this.subject.unSubscribeObserver(this);
        System.out.println("Unsubscribed successfully.");
    }
}
