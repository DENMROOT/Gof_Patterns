package factory.model.impl.factory;


import factory.model.AbstractFactory;
import factory.model.DbProvider;
import factory.model.impl.dbprovider.CurrencyXmlDBPoviderImpl;
import factory.model.impl.dbprovider.ItemXmlDBPoviderImpl;

/**
 * Created by User on 17.10.2015.
 */
public class XmlDBFactory implements AbstractFactory {
    @Override
    public DbProvider getDBProvider(String parserType) {
        switch(parserType){
            case "Item": return new ItemXmlDBPoviderImpl();
            case "Currency": return new CurrencyXmlDBPoviderImpl();
        }
        return null;
    }
}
