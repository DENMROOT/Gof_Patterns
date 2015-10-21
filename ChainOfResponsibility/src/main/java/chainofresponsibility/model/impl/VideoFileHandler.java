package chainofresponsibility.model.impl;

import chainofresponsibility.model.Handler;

/**
 * Created by User on 19.10.2015.
 */
public class VideoFileHandler implements Handler {
    private Handler handler;
    private String handlerName;

    public VideoFileHandler(String handlerName){
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {

        if(file.getFileType().equals("video")){
            System.out.println("Process and saving text file... by "+handlerName);
        }else if(handler!=null){
            System.out.println(handlerName+" fowards request to "+handler.getHandlerName());
            handler.process(file);
        }else{
            System.out.println("File not supported");
        }

    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
