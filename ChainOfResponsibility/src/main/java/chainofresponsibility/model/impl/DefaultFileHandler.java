package chainofresponsibility.model.impl;

import chainofresponsibility.model.Handler;

/**
 * Created by User on 19.10.2015.
 */
public class DefaultFileHandler implements Handler {
    private Handler handler;
    private String handlerName;

    public DefaultFileHandler(String handlerName){
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {
        System.out.println("File not supported by our system");
    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
