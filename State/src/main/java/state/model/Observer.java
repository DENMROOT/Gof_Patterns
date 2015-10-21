package state.model;

import state.model.impl.FlightType;

/**
 * Created by User on 19.10.2015.
 */
public interface Observer {
    public void update(String desc, FlightType type);
    public void subscribe();
    public void unSubscribe();
}
