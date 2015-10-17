package observer.model.customImpl;

/**
 * Created by dmakarov on 10/8/2015.
 */
public interface Subject {
    public void subscribeObserver(Observer observer);
    public void unSubscribeObserver(Observer observer);
    public void notifyObservers();
    public String subjectDetails();
}
