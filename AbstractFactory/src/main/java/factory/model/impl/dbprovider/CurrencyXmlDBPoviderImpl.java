package factory.model.impl.dbprovider;

import factory.model.DBEntity;
import factory.model.DbProvider;

/**
 * Created by User on 17.10.2015.
 */
public class CurrencyXmlDBPoviderImpl implements DbProvider {
    @Override
    public String add(DBEntity entity) {
        return "CurrencyXml add " + entity.exec();

    }

    @Override
    public String save(DBEntity entity) {
        return "CurrencyXml save " + entity.exec();
    }

    @Override
    public String delete(DBEntity entity) {
        return "CurrencyXml delete " + entity.exec();
    }

    @Override
    public String update(DBEntity entity) {
        return "CurrencyXml update " + entity.exec();
    }
}
