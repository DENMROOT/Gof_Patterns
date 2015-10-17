package factory.model.impl.dbprovider;

import factory.model.DBEntity;
import factory.model.DbProvider;

/**
 * Created by User on 17.10.2015.
 */
public class ItemObjectDBPoviderImpl implements DbProvider {
    @Override
    public String add(DBEntity entity) {
        return "ItemObject add " + entity.exec();

    }

    @Override
    public String save(DBEntity entity) {
        return "ItemObject save " + entity.exec();
    }

    @Override
    public String delete(DBEntity entity) {
        return "ItemObject delete " + entity.exec();
    }

    @Override
    public String update(DBEntity entity) {
        return "ItemObject update" + entity.exec();
    }
}
