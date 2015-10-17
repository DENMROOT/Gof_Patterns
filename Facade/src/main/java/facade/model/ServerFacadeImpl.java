package facade.model;

/**
 * Created by dmakarov on 10/7/2015.
 */
public class ServerFacadeImpl implements ServerFacade{
    private Server server;

    public ServerFacadeImpl(Server server) {
        this.server = server;
    }

    @Override
    public void startServer() {
        server.startBooting();
        server.readSystemConfigFile();
        server.init();
        server.initializeContext();
        server.initializeListeners();
        server.createSystemObjects();
    }

    @Override
    public void stopServer() {
        server.releaseProcesses();
        server.destory();
        server.destroySystemObjects();
        server.destoryListeners();
        server.destoryContext();
        server.shutdown();
    }
}
