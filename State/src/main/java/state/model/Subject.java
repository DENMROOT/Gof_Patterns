package state.model;

/**
 * Created by User on 19.10.2015.
 */
public interface Subject{
    public void subscribeObserver(Observer observer);
    public void unSubscribeObserver(Observer observer);
    public void notifyObservers();
    public String subjectDetails();
}
