package factory.model;

/**
 * Created by User on 17.10.2015.
 */
public interface DbProvider {
    String add(DBEntity entity);
    String save(DBEntity entity);
    String delete(DBEntity entity);
    String update(DBEntity entity);
}
