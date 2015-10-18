package flyweight.model.impl;

import flyweight.model.GameObject;

/**
 * Created by User on 18.10.2015.
 */
public class BlankField implements GameObject {
    @Override
    public void drawField() {
        System.out.print(" ");
    }
}
