package visitor.model.impl;

import visitor.model.FSElement;
import visitor.model.Visitor;

/**
 * Created by User on 18.10.2015.
 */
public class CountVisitor implements Visitor {
    private int count = 0;

    @Override
    public void visit(File element) {
        count++;
    }

    @Override
    public void visit(Directory parentElement) {
        for (FSElement element : parentElement.getChildren()) {
            element.accept(this);
        }
        count++;
    }

    public int getCount() {
        return count;
    }
}
