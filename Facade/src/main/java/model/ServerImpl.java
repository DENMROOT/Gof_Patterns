package model;

/**
 * Created by dmakarov on 10/7/2015.
 */
public class ServerImpl implements Server {
    @Override
    public void startBooting() {
        System.out.println("startBooting" );
    }

    @Override
    public void readSystemConfigFile() {
        System.out.println("readSystemConfigFile" );
    }

    @Override
    public void init() {
        System.out.println("init" );
    }

    @Override
    public void initializeContext() {
        System.out.println("initializeContext" );
    }

    @Override
    public void initializeListeners() {
        System.out.println("initializeListeners" );
    }

    @Override
    public void createSystemObjects() {
        System.out.println("createSystemObjects" );
    }

    @Override
    public void releaseProcesses() {
        System.out.println("releaseProcesses" );
    }

    @Override
    public void destory() {
        System.out.println("destory" );
    }

    @Override
    public void destroySystemObjects() {
        System.out.println("destroySystemObjects" );
    }

    @Override
    public void destoryListeners() {
        System.out.println("destoryListeners" );
    }

    @Override
    public void destoryContext() {
        System.out.println("destoryContext" );
    }

    @Override
    public void shutdown() {
        System.out.println("shutdown" );
    }
}
