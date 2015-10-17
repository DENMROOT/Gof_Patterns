package factory.model;

/**
 * Created by User on 17.10.2015.
 */
public interface AbstractFactory {
    public DbProvider getDBProvider(String parserType);
}
