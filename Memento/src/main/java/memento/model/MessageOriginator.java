package memento.model;

/**
 * Created by User on 19.10.2015.
 */
public class MessageOriginator {
    private String message;

    private String lastUndoSavepoint;
    MessageCareTaker careTaker;

    public MessageOriginator(String  message, MessageCareTaker careTaker){
        this.message = message;

        this.careTaker = careTaker;

        createSavepoint("INITIAL");
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void createSavepoint(String savepointName){
        careTaker.saveMemento(new MessageMemento(this.message), savepointName);
        lastUndoSavepoint = savepointName;
    }

    public void undo(){
        setOriginatorState(lastUndoSavepoint);
    }

    public void undo(String savepointName){
        setOriginatorState(savepointName);
    }

    public void undoAll(){
        setOriginatorState("INITIAL");
        careTaker.clearSavepoints();
    }

    private void setOriginatorState(String savepointName){
        MessageMemento mem = careTaker.getMemento(savepointName);
        this.message = mem.getMessage();
    }

    @Override
    public String toString(){
        return "message: "+ message;
    }
}
