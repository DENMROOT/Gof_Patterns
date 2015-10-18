package visitor.model.impl;

import visitor.model.FSElement;
import visitor.model.Visitor;

/**
 * Created by User on 18.10.2015.
 */
public class FSSizeVisitor implements Visitor {
    private int fsSize = 0;

    @Override
    public void visit(File element) {
        fsSize+=element.getFileSize();
    }

    @Override
    public void visit(Directory parentElement) {
        for (FSElement element : parentElement.getChildren()) {
            element.accept(this);
        }
    }

    public int getSize() {
        return fsSize;
    }
}
