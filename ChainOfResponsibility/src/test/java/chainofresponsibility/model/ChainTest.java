package chainofresponsibility.model;

import chainofresponsibility.model.impl.*;
import org.junit.Test;

/**
 * Created by DENM on 21.10.2015.
 */
public class ChainTest {
    private File file = null;
    @Test
    public void ChainTest(){

        TextFileHandler textFileHandler = new TextFileHandler("Text file Handler");
        DocFileHandler docFileHandler = new DocFileHandler("Doc file Handler");
        VideoFileHandler videoFileHandler = new VideoFileHandler("Video file Handler");
        DefaultFileHandler defaultFileHandler = new DefaultFileHandler("Default file Handler");

        textFileHandler.setHandler(docFileHandler);
        docFileHandler.setHandler(videoFileHandler);
        videoFileHandler.setHandler(defaultFileHandler);

        file = new File("readme.doc", "doc", "c:\\\\");
        textFileHandler.process(file);

        file = new File("xxx.video", "video", "c:\\\\");
        textFileHandler.process(file);
    }
}
