package interpreter.model.impl;

import interpreter.model.Expression;

/**
 * Created by User on 19.10.2015.
 */
public class Product implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;

    public Product(Expression leftExpression, Expression rightExpression){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }
    @Override
    public int interpret() {
        return leftExpression.interpret() * rightExpression.interpret();
    }
}
