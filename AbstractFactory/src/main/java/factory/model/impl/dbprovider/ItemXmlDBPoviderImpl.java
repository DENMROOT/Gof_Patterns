package factory.model.impl.dbprovider;

import factory.model.DBEntity;
import factory.model.DbProvider;

/**
 * Created by User on 17.10.2015.
 */
public class ItemXmlDBPoviderImpl implements DbProvider {
    @Override
    public String add(DBEntity entity) {
        return "ItemXML add " + entity.exec();

    }

    @Override
    public String save(DBEntity entity) {
        return "ItemXML save " + entity.exec();
    }

    @Override
    public String delete(DBEntity entity) {
        return "ItemXML delete " + entity.exec();
    }

    @Override
    public String update(DBEntity entity) {
        return "ItemXML update " + entity.exec();
    }
}
