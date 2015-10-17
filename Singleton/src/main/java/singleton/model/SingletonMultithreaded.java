package singleton.model;

/**
 * Created by dmakarov on 10/8/2015.
 */
public class SingletonMultithreaded {
    private volatile static SingletonMultithreaded instance = null;

    private SingletonMultithreaded() {
    }

    public static SingletonMultithreaded getInstance(){
        if(instance==null) {
            synchronized (SingletonMultithreaded.class) {
                if (instance==null) {
                    instance = new SingletonMultithreaded();
                }
            }
        }
        return instance;
    }
}
