package ru.study.ziza.calculator;

/**
 * Created by Юрий on 02.02.2015.
 */
public interface iValue {
    public String getString();
    public double getDouble();
    public void addNumber(String s);
    public void negate();
    public void addDot();
    public void reset();
}