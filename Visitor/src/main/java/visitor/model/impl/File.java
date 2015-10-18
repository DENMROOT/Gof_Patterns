package visitor.model.impl;

import visitor.model.FSElement;
import visitor.model.Visitor;

import java.util.List;

/**
 * Created by User on 18.10.2015.
 */
public class File implements FSElement {
    private String name;
    private int fileSize;

    public File(String name, int fileSize) {
        this.name = name;
        this.fileSize = fileSize;
    }

    @Override
    public List<FSElement> getChildren() {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    @Override
    public void addElement(FSElement element) {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    @Override
    public void removeElement(FSElement element) {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    @Override
    public void buildFS() {
        System.out.println(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getFileSize() {
        return fileSize;
    }
}
