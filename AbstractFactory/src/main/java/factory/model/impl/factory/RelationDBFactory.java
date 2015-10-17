package factory.model.impl.factory;

import factory.model.AbstractFactory;
import factory.model.DbProvider;
import factory.model.impl.dbprovider.CurrencyRelationDBPoviderImpl;
import factory.model.impl.dbprovider.ItemRelationDBPoviderImpl;

/**
 * Created by User on 17.10.2015.
 */
public class RelationDBFactory implements AbstractFactory {
    @Override
    public DbProvider getDBProvider(String parserType) {
        switch(parserType){
            case "Item": return new ItemRelationDBPoviderImpl();
            case "Currency": return new CurrencyRelationDBPoviderImpl();
        }
        return null;
    }
}
