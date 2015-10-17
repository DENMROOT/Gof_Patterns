package factory.model.impl.dbprovider;

import factory.model.DBEntity;
import factory.model.DbProvider;

/**
 * Created by User on 17.10.2015.
 */
public class CurrencyObjectDBPoviderImpl implements DbProvider {
    @Override
    public String add(DBEntity entity) {
        return "CurrencyObject add " + entity.exec();

    }

    @Override
    public String save(DBEntity entity) {
        return "CurrencyObject save " + entity.exec();
    }

    @Override
    public String delete(DBEntity entity) {
        return "CurrencyObject delete " + entity.exec();
    }

    @Override
    public String update(DBEntity entity) {
        return "CurrencyObject update " + entity.exec();
    }
}
