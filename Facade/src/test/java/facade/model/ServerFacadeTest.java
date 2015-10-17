package facade.model;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;

import static org.junit.Assert.assertEquals;

/**
 * Created by dmakarov on 10/7/2015.
 */
public class ServerFacadeTest {
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Test
    public void ServerFacadeTest(){
        System.setProperty("line.separator","\r\n");
        Server server = new ServerImpl();
        ServerFacade serverFacade = new ServerFacadeImpl(server);
        serverFacade.startServer();
        serverFacade.stopServer();

        assertEquals("startBooting" + System.lineSeparator() +
                "readSystemConfigFile" + System.lineSeparator() +
                "init" + System.lineSeparator() +
                "initializeContext" + System.lineSeparator() +
                "initializeListeners" + System.lineSeparator() +
                "createSystemObjects" + System.lineSeparator() +
                "releaseProcesses" + System.lineSeparator() +
                "destory" + System.lineSeparator() +
                "destroySystemObjects" + System.lineSeparator() +
                "destoryListeners" + System.lineSeparator() +
                "destoryContext" + System.lineSeparator() +
                "shutdown" + System.lineSeparator(), log.getLog());
    }
}
