package model.customImpl;

import model.customImpl.Impl.CommentaryObject;
import model.customImpl.Impl.SmsUsers;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by dmakarov on 10/8/2015.
 */
public class CustomObserverTest {
    @Test
    public void CustomObserverTest(){
        Subject subject = new CommentaryObject(new ArrayList<Observer>(), "Test Soccer match");
        Observer observer_1 = new SmsUsers("Denys Makarov [Kyiv]");
        observer_1.subscribe(subject);
        Observer observer_2 = new SmsUsers("Igor Ivanov [Zaporizhzhya]");
        observer_2.subscribe(subject);

        Commentary commentObject = ((Commentary)subject);
        commentObject.setDesc("Welcome to the match!!!");
        commentObject.setDesc("Current score is 0:0");

        observer_2.unSubscribe();

        commentObject.setDesc("Interesting game, full of attacking and defence action");
        commentObject.setDesc("SCORE !!! Alabama take a lead - 1:0");

    }
}
