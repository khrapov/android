package ru.study.ziza.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends ActionBarActivity {


    String o1 = "";
    String o2 = "";
    String op = "";
    boolean dot = false;


    TextView text;
    HorizontalScrollView hsv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView1);
        hsv = (HorizontalScrollView) findViewById(R.id.scroller);
        //text.setMovementMethod(new ScrollingMovementMethod());
    }

    public void addNum(String s) {
        if (text.getText() == "")
            text.setText(text.getText() + s);
        else
            text.setText(text.getText() + s);

        hsv.postDelayed(new Runnable() {

            public void run() {
                hsv.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
            }
        }, 100L);
    }


    public void onNumberButtonClick(View view) {
        switch (view.getId()) {
            case R.id.button0:
                addNum(getString(R.string.button0));
                Toast.makeText(this, "Нажали 0", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button1:
                addNum(getString(R.string.button1));
                Toast.makeText(this, "Нажали 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this, text.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(this, "Нажали 3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(this, "Нажали 4", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(this, "Нажали 5", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                Toast.makeText(this, "Нажали 6", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button7:
                Toast.makeText(this, "Нажали 7", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button8:
                Toast.makeText(this, "Нажали 8", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button9:
                Toast.makeText(this, "Нажали 9", Toast.LENGTH_SHORT).show();
                break;
        }


    }
}
