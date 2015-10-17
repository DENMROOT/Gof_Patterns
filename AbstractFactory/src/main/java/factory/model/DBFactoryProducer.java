package factory.model;

import factory.model.impl.DBProviderType;
import factory.model.impl.factory.ObjectDBFactory;
import factory.model.impl.factory.RelationDBFactory;
import factory.model.impl.factory.XmlDBFactory;

/**
 * Created by User on 17.10.2015.
 */
public class DBFactoryProducer {
    private DBFactoryProducer(){
        throw new AssertionError();
    }

    public static AbstractFactory getFactory(DBProviderType type){

        switch(type)
        {
            case RELATION_DB: return new RelationDBFactory();
            case XML_DB: return new XmlDBFactory();
            case OBJECT_DB: return new ObjectDBFactory();
        }

        return null;
    }
}
