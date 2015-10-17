package factory.model.impl.dbprovider;

import factory.model.DBEntity;
import factory.model.DbProvider;

/**
 * Created by User on 17.10.2015.
 */
public class ItemRelationDBPoviderImpl implements DbProvider {
    @Override
    public String add(DBEntity entity) {
        return "ItemRelation add " + entity.exec();

    }

    @Override
    public String save(DBEntity entity) {
        return "ItemRelation save " + entity.exec();
    }

    @Override
    public String delete(DBEntity entity) {
        return "ItemRelation delete " + entity.exec();
    }

    @Override
    public String update(DBEntity entity) {
        return "ItemRelation update " + entity.exec();
    }
}
