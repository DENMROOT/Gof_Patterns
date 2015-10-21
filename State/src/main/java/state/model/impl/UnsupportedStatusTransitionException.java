package state.model.impl;

/**
 * Created by dmakarov on 10/21/2015.
 */
public class UnsupportedStatusTransitionException extends RuntimeException {

    public UnsupportedStatusTransitionException(String message) {
        super(message);
    }
}
