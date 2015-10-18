package flyweight.model.impl;

import flyweight.model.GameObject;

/**
 * Created by User on 18.10.2015.
 */
public class NumberField implements GameObject {
    protected String number;

    public NumberField(String number) {
        this.number=number;
    }

    @Override
    public void drawField() {
        System.out.print(this.number);
    }
}
