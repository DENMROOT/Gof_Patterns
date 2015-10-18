package flyweight.model;

import flyweight.model.impl.*;

import java.lang.AssertionError;import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 18.10.2015.
 */
public final class MinesFactory {
    private static Map<FieldType, GameObject> map = new HashMap<>();
    private MinesFactory(){
        throw new AssertionError("Cannot instantiate the class");
    }

    public static synchronized GameObject getGameObject(FieldType gameObjectType){
        GameObject gameObject = map.get(gameObjectType);
        if(gameObject==null){
            switch(gameObjectType){
                case NUMBER_1:  gameObject = new NumberField("1");
                    break;
                case NUMBER_2 : gameObject = new NumberField("2");
                    break;
                case NUMBER_3 : gameObject = new NumberField("3");
                    break;
                case NUMBER_4 : gameObject = new NumberField("4");
                    break;
                case NUMBER_5 : gameObject = new NumberField("5");
                    break;
                case NUMBER_6 : gameObject = new NumberField("6");
                    break;
                case BLANK : gameObject = new BlankField();
                    break;
                case FLAG : gameObject = new FlagField();
                    break;
                case BOMB : gameObject = new BombField();
                    break;
            }
            map.put(gameObjectType , gameObject);
        }
        return gameObject;
    }
}
