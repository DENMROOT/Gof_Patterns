package interpreter.model;

import interpreter.model.impl.*;
import org.junit.Test;

import java.util.Stack;

import static junit.framework.Assert.assertEquals;

/**
 * Created by DENM on 21.10.2015.
 */
public class InterpreterTest {
    private final static int RESULT = 12;
    @Test
    public void InterpreterResultTest(){


        String tokenString = "7 3 - 2 1 + *";
        Stack<Expression> stack = new Stack<>();
        String[] tokenArray = tokenString.split(" ");
        for (String s : tokenArray) {
            if (ExpressionUtils.isOperator(s)) {
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                Expression operator = ExpressionUtils.getOperator(s, leftExpression,rightExpression);
                int result = operator.interpret();
                stack.push(new interpreter.model.impl.Number(result));
            } else {
                Expression i = new interpreter.model.impl.Number(Integer.parseInt(s));
                stack.push(i);
            }
        }

        assertEquals(RESULT, stack.pop().interpret());
    }
}
