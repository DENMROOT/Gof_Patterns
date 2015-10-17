package factory.model;

import factory.model.impl.DBProviderType;
import factory.model.impl.model.Currency;
import factory.model.impl.model.Item;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dmakarov on 10/7/2015.
 */
public class AbstractFactoryTest {
    @Test
    public void OldPayGatewayTest(){
        AbstractFactory abstractFactory = DBFactoryProducer.getFactory(DBProviderType.XML_DB);
        DbProvider factory = abstractFactory.getDBProvider("Item");

        DBEntity entity = new Item();
        System.out.println(factory.add(entity));
        System.out.println(factory.save(entity));
        System.out.println(factory.update(entity));
        System.out.println(factory.delete(entity));

        entity = new Currency();
        abstractFactory = DBFactoryProducer.getFactory(DBProviderType.RELATION_DB);
        factory = abstractFactory.getDBProvider("Currency");

        System.out.println(factory.add(entity));
        System.out.println(factory.save(entity));
        System.out.println(factory.update(entity));
        System.out.println(factory.delete(entity));
    }

}
