package memento.model;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by DENM on 22.10.2015.
 */
public class MementoTest {
    @Test
    public void MementoTest(){
        MessageCareTaker mCareTaker = new MessageCareTaker();
        MessageOriginator mOriginator = new MessageOriginator("initial message", mCareTaker);

        mOriginator.createSavepoint("initial");

        mOriginator.setMessage("first message");
        assertEquals(mOriginator.getMessage(), "first message");

        mOriginator.undo("initial");
        assertEquals(mOriginator.getMessage(), "initial message");
    }
}
