package memento.model;

/**
 * Created by User on 19.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        MessageCareTaker mCareTaker = new MessageCareTaker();
        MessageOriginator mOriginator = new MessageOriginator("initial message", mCareTaker);

        System.out.println("default state: " + mOriginator);

        mOriginator.createSavepoint("initial");
        mOriginator.setMessage("first message");

        System.out.println("new state: " + mOriginator);

        mOriginator.undo("initial");
        System.out.println("new state: " + mOriginator);
    }
}
