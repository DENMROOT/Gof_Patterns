package interpreter.model.impl;

import interpreter.model.Expression;

/**
 * Created by User on 19.10.2015.
 */
public class Number implements Expression {
    private final int n;

    public Number(int n){
        this.n = n;
    }
    @Override
    public int interpret() {
        return n;
    }
}
