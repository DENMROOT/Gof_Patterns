package observer.model.customImpl;

/**
 * Created by dmakarov on 10/8/2015.
 */
public interface Observer {
    public void update(String desc);
    public void subscribe(Subject subject);
    public void unSubscribe();
}
