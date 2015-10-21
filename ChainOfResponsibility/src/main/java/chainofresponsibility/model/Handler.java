package chainofresponsibility.model;


import chainofresponsibility.model.impl.File;

/**
 * Created by User on 19.10.2015.
 */
public interface Handler {
    public void setHandler(Handler handler);
    public void process(File file);
    public String getHandlerName();
}
