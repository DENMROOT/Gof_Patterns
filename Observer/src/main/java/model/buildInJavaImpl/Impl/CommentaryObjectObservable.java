package model.buildInJavaImpl.Impl;

import model.customImpl.Commentary;

import java.util.Observable;

/**
 * Created by dmakarov on 10/8/2015.
 */
public class CommentaryObjectObservable extends Observable implements Commentary{
    private String desc;
    private final String subjectDetails;

    public CommentaryObjectObservable(String subjectDetails){
        this.subjectDetails = subjectDetails;
    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;
        setChanged();
        notifyObservers(desc);
    }

    public String subjectDetails() {
        return subjectDetails;
    }
}
