package flyweight.model;

import org.junit.Test;

/**
 * Created by DENM on 18.10.2015.
 */
public class FlyweightTest {
    @Test
    public void FlyweightTest (){
        GameObject object;
        for (int i=0; i<=10; i++){
            for (int j=0; j<=10; j++){
                object = MinesFactory.getGameObject(FieldType.getRandomFieldType());
                object.drawField();
            }
            System.out.println();
        }
    }
}
