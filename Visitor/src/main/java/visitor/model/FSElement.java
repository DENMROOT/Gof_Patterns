package visitor.model;

import java.util.List;

/**
 * Created by User on 18.10.2015.
 */
public interface FSElement {
    List<FSElement> getChildren();
    void addElement(FSElement element);
    void removeElement(FSElement element);
    void buildFS();
    public void accept(Visitor visitor);

}
