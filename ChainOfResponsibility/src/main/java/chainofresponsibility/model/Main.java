package chainofresponsibility.model;

import chainofresponsibility.model.impl.*;

/**
 * Created by User on 19.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        File file = null;
        TextFileHandler textFileHandler = new TextFileHandler("Text file Handler");
        DocFileHandler docFileHandler = new DocFileHandler("Doc file Handler");
        VideoFileHandler videoFileHandler = new VideoFileHandler("Video file Handler");
        DefaultFileHandler defaultFileHandler = new DefaultFileHandler("Default file Handler");

        textFileHandler.setHandler(docFileHandler);
        docFileHandler.setHandler(videoFileHandler);
        docFileHandler.setHandler(defaultFileHandler);

        file = new File("readme.doc", "doc", "c:\\\\");
        textFileHandler.process(file);

        file = new File("xxx.video", "", "c:\\\\");
        textFileHandler.process(file);


    }
}
