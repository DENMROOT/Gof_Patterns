package memento.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 19.10.2015.
 */
public class MessageCareTaker {
    private final Map<String, MessageMemento> savepointStorage = new HashMap<String, MessageMemento>();

    public void saveMemento(MessageMemento memento,String savepointName){
        System.out.println("Saving state..."+savepointName);
        savepointStorage.put(savepointName, memento);
    }

    public MessageMemento getMemento(String savepointName){
        System.out.println("Undo at ..."+savepointName);
        return savepointStorage.get(savepointName);
    }

    public void clearSavepoints(){
        System.out.println("Clearing all save points...");
        savepointStorage.clear();
    }
}
