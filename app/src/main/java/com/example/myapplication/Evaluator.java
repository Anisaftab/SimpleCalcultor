package com.example.myapplication;

import java.math.BigDecimal;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Evaluator {
    ScriptEngine engine;
    Evaluator(){
        engine = new ScriptEngineManager().getEngineByName("rhino");
    }

    public BigDecimal evaluate(String expression) throws ScriptException {
        String result = engine.eval(expression).toString();

        return new BigDecimal(result);
    }
}
