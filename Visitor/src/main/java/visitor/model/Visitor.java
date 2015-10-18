package visitor.model;

import visitor.model.impl.Directory;
import visitor.model.impl.File;

/**
 * Created by User on 18.10.2015.
 */
public interface Visitor {
    public void visit(File element);
    public void visit(Directory parentElement);
}
