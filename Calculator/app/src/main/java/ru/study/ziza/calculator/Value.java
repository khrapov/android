package ru.study.ziza.calculator;

import android.util.Log;

/**
 * Created by Юрий on 02.02.2015.
 */

public class Value implements iValue {
    private String data;
    private boolean isNegate = false;
    private boolean hasDot = false;
    private boolean initialized = false;

    public Value() {
        data = "0";
    }
    public void setValue(double d){
        if (d<0){
            isNegate=true;
            d=-d;
        }
        if ((d - (int)d) != 0){
            hasDot=true;
            data = String.valueOf(d);
        }else{
            data = String.valueOf((int) d);
        }
    }

    public String getString() {
        Log.i("Value", data);
        return isNegate ? "-" + data : data;
    }

    public double getDouble() {
        double d = Double.valueOf(data);
        return isNegate ? -1 * d : d;
    }

    public void addNumber(String s) {
        if (data == "0") {
            data = s;
            initialized = true;
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
        initialized = false;
    }

    public boolean isInitialized(){
        return initialized;
    }

    public void addDot() {
        if (!hasDot) {
            data += ".";
            hasDot = true;
            initialized = true;
        }
    }

}