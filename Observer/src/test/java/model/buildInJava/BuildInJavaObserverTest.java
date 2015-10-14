package model.buildInJava;

import model.buildInJavaImpl.Impl.CommentaryObjectObservable;
import model.buildInJavaImpl.Impl.SmsUsersObserver;
import model.customImpl.Impl.SmsUsers;
import org.junit.Test;

import java.util.Observer;

/**
 * Created by dmakarov on 10/8/2015.
 */
public class BuildInJavaObserverTest {
    @Test
    public void CustomObserverTest(){
        CommentaryObjectObservable obj = new CommentaryObjectObservable
                ("Test Soccer match");
        SmsUsersObserver observer_1 = new SmsUsersObserver("Denys Makarov [Kyiv]");
        observer_1.subscribe(obj);
        SmsUsersObserver observer_2 = new SmsUsersObserver("Igor Ivanov [Zaporizhzhya]");
        observer_2.subscribe(obj);

        obj.setDesc("Welcome to the match!!!");
        obj.setDesc("Current score is 0:0");

        observer_2.unSubscribe();

        obj.setDesc("Interesting game, full of attacking and defence action");
        obj.setDesc("SCORE !!! Alabama take a lead - 1:0");

    }
}
