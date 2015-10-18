package visitor.model.impl;

import visitor.model.FSElement;
import visitor.model.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 18.10.2015.
 */
public class Directory implements FSElement {
    private String name;
    private List<FSElement> elements = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public List<FSElement> getChildren() {
        return elements;
    }

    @Override
    public void addElement(FSElement element) {
        elements.add(element);
    }

    @Override
    public void removeElement(FSElement element) {
        elements.remove(element);
    }

    @Override
    public void buildFS() {
        System.out.println(name);
        for (FSElement element : elements) {
            element.buildFS();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
