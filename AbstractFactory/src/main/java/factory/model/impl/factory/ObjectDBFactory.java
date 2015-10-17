package factory.model.impl.factory;

import factory.model.AbstractFactory;
import factory.model.DbProvider;
import factory.model.impl.dbprovider.CurrencyObjectDBPoviderImpl;
import factory.model.impl.dbprovider.ItemObjectDBPoviderImpl;

/**
 * Created by User on 17.10.2015.
 */
public class ObjectDBFactory implements AbstractFactory {
    @Override
    public DbProvider getDBProvider(String parserType) {
        switch(parserType){
            case "Item": return new ItemObjectDBPoviderImpl();
            case "Currency": return new CurrencyObjectDBPoviderImpl();
        }
        return null;
    }
}
