package com.example.nick.application002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
    TextView t;
    String s1,s2;
    int op=0;
    double z;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*b1= (Button) findViewById(R.id.button1);
        b2= (Button) findViewById(R.id.button2);
        b3= (Button) findViewById(R.id.button3);
        b4= (Button) findViewById(R.id.button4);
        b5= (Button) findViewById(R.id.button5);
        b6= (Button) findViewById(R.id.button6);
        b7= (Button) findViewById(R.id.button7);
        b8= (Button) findViewById(R.id.button8);
        b9= (Button) findViewById(R.id.button9);
        b10= (Button) findViewById(R.id.button10);
        b11= (Button) findViewById(R.id.button11);*/

        t= (TextView) findViewById(R.id.textView);


    }

    public void one(View view)
    {
        t.setText(t.getText()+"1");
    }

    public void two(View view)
    {
        t.setText(t.getText()+"2");

    }

    public void three(View view)
    {
        t.setText(t.getText()+"3");

    }

    public void four(View view)
    {
        t.setText(t.getText()+"4");

    }

    public void five(View view)
    {
        t.setText(t.getText()+"5");

    }

    public void six(View view)
    {
        t.setText(t.getText()+"6");

    }

    public void seven(View view)
    {
        t.setText(t.getText()+"7");

    }

    public void eight(View view)
    {
        t.setText(t.getText()+"8");

    }

    public void nine(View view)
    {
        t.setText(t.getText()+"9");

    }

    public void zero(View view)
    {
        t.setText(t.getText()+"0");
    }

    public void equalsto(View view)
    {
        double x=Double.parseDouble(s1);
        double y=Double.parseDouble(s2);
        if(op==1)
        {
            z=x+y;
        }
        else if(op==2)
        {
            z=x-y;
        }
        else if(op==3)
        {
            z=x*y;
        }
        else if(op==4)
        {
            z=x/y;
        }
        t.setText(z+"");
    }

    public void add(View view)
    {
        op=1;
        s1= (String) t.getText();
        t.setText("0");
    }

    public void subtract(View view)
    {
        op=2;
        s1= (String) t.getText();
        t.setText("0");

    }

    public void multiply(View view)
    {
        op=3;
        s1= (String) t.getText();
        t.setText("0");
    }

    public void divide(View view)
    {
        op=4;
        s1= (String) t.getText();
        t.setText("0");
    }

}
