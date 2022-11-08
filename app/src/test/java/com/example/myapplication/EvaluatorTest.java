package com.example.myapplication;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.math.BigDecimal;

import javax.script.ScriptException;


public class EvaluatorTest {

    Evaluator evaluator = new Evaluator();
    double actualValue;
    double expectedValue;

    @Test
    public void evaluateAddition() throws ScriptException {

        actualValue = evaluator.evaluate("2+2").doubleValue();

        expectedValue = 4.00;
        assertEquals( "Addition not working,",actualValue,expectedValue,1e-3);
    }
    @Test
    public void evaluateSubtraction() throws ScriptException {
        actualValue = evaluator.evaluate("15-9").doubleValue();

        expectedValue = 6.00;
        assertEquals( "Subtraction not working,",actualValue,expectedValue,1e-3);
    }
    @Test
    public void evaluateMultiplication() throws ScriptException {
        actualValue = evaluator.evaluate("15*10").doubleValue();

        expectedValue = 150.00;
        assertEquals( "Multiplication not working,",actualValue,expectedValue,1e-3);
    }

    @Test
    public void evaluateDivision() throws ScriptException {

        actualValue = evaluator.evaluate("15/5").doubleValue();

        expectedValue = 3.00;
        assertEquals( "Division not working,",expectedValue,actualValue, 1e-3);
    }



}
