package ru.study.ziza.calculator;

/**
 * Created by Юрий on 02.02.2015.
 */

public class Value implements iValue {
    private String data;
    private boolean isNegate = false;
    private boolean hasDot = false;

    public Value() {
        data = "0";
    }
    public void setValue(double d){
        data = String.valueOf(d);
    }

    public String getString() {
        return isNegate ? "-" + data : data;
    }

    public double getDouble() {
        double d = Double.valueOf(data);
        return isNegate ? -1 * d : d;
    }

    public void addNumber(String s) {
        if (data == "0") {
            data = s;
        } else {
            data += s;
        }
    }

    public boolean isNegate() {
        return isNegate;
    }

    public void negate() {
        isNegate = !isNegate;
    }

    public void reset() {
        data = "0";
        isNegate = false;
        hasDot = false;
    }

    public void addDot() {
        if (!hasDot) {
            data += ".";
            hasDot = true;
        }
    }

}