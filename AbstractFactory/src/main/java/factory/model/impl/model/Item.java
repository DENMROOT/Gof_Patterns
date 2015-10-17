package factory.model.impl.model;


import factory.model.DBEntity;

/**
 * Created by User on 17.10.2015.
 */
public class Item implements DBEntity {
    public String name="Item";

    @Override
    public String exec() {
        return name;
    }
}
