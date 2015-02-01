package ru.study.ziza.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends ActionBarActivity {





    private iValue currentValue;
    private Value first = new Value();
    private Value second = new Value();
    private String operation = "";
    private TextView text;
    HorizontalScrollView hsv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView1);
        hsv = (HorizontalScrollView) findViewById(R.id.scroller);
        //text.setMovementMethod(new ScrollingMovementMethod());
        reset();
        updateUI();
    }

    private void updateUI() {
        text.setText(currentValue.getString());
        hsv.postDelayed(new Runnable() {

            public void run() {
                hsv.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
            }
        }, 100L);
    }

    public void calc(View view) {
        double a = first.getDouble();
        double b = second.getDouble();
        double c = 0d;
        switch (operation) {
            case "+":
                c = a + b;
                break;
            case "-":
                c = a - b;
                break;
            case "*":
                c = a * b;
                break;
            case "/":
                c = a / b;
                break;
            default:
                break;
        }
        reset();
        first.setValue(c);
        updateUI();
    }
    public void onButtonReversClick(View view){
        currentValue.negate();
        updateUI();
    }
    public void onResetButtonClick(View view){
        reset();
        updateUI();
    }

    public void onNumberButtonClick(View view) {
        switch (view.getId()) {
            case R.id.button0:
                currentValue.addNumber("0");
                break;
            case R.id.button1:
                currentValue.addNumber("1");
                break;
            case R.id.button2:
                currentValue.addNumber("2");
                break;
            case R.id.button3:
                currentValue.addNumber("3");
                break;
            case R.id.button4:
                currentValue.addNumber("4");
                break;
            case R.id.button5:
                currentValue.addNumber("5");
                break;
            case R.id.button6:
                currentValue.addNumber("6");
                break;
            case R.id.button7:
                currentValue.addNumber("7");
                break;
            case R.id.button8:
                currentValue.addNumber("8");
                break;
            case R.id.button9:
                currentValue.addNumber("9");
                break;
            case R.id.button_dot:
                currentValue.addDot();
                break;
            default:
                currentValue.reset();
                break;
        }
        updateUI();
    }

    public void onOperationButtonClick(View view) {
        currentValue = second;
        switch (view.getId()) {
            case R.id.button_div:
                operation = "/";
                break;
            case R.id.button_minus:
                operation = "-";
                break;
            case R.id.button_mult:
                operation = "*";
                break;
            case R.id.button_plus:
                operation = "+";
                break;
            default:
                operation = "";
                break;
        }
        text.setText(operation);
    }
    public void reset(){
        first.reset();
        second.reset();
        operation = "";
        currentValue = first;
    }
    
}
