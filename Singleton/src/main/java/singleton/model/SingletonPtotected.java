package singleton.model;

import java.io.ObjectStreamException;

/**
 * Created by dmakarov on 10/8/2015.
 */
public class SingletonPtotected {
    private static final long serialVersionUID = -1093810940935189395L;
    private static SingletonPtotected instance = new SingletonPtotected();

    /*
    Reflection protection
     */
    private SingletonPtotected(){
        if(instance !=null){
            throw new IllegalStateException("Already created.");
        }
    }
    public static SingletonPtotected getInstance(){
        return instance;
    }

    /*
    Serialization protection
     */
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
    /*
    Serialization protection
     */
    private Object writeReplace() throws ObjectStreamException{
        return instance;
    }
    /*
    .clone() protection
     */
    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Singleton, cannot be clonned");
    }

    /*
    Different class loaders protection
     */
    private static Class getClass(String classname) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if(classLoader == null)
            classLoader = Singleton.class.getClassLoader();
        return (classLoader.loadClass(classname));
    }
}
