package factory.model.impl.dbprovider;

import factory.model.DBEntity;
import factory.model.DbProvider;

/**
 * Created by User on 17.10.2015.
 */
public class CurrencyRelationDBPoviderImpl implements DbProvider {
    @Override
    public String add(DBEntity entity) {
        return "CurrencyRelation add " + entity.exec();

    }

    @Override
    public String save(DBEntity entity) {
        return "CurrencyRelation save " + entity.exec();
    }

    @Override
    public String delete(DBEntity entity) {
        return "CurrencyRelation delete " + entity.exec();
    }

    @Override
    public String update(DBEntity entity) {
        return "CurrencyRelation update " + entity.exec();
    }
}
