package com.example.native_cal;

import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView; 


@SuppressLint("NewApi") public class MainActivity extends ActionBarActivity {
	Button plus,minus,mul,div;
	EditText t1,t2;
	TextView res;
	double num1,num2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        t1 = (EditText)findViewById(R.id.editText1);
        t2 = (EditText)findViewById(R.id.editText2);
        res = (TextView)findViewById(R.id.textView1);
        plus = (Button)findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus);
        mul= (Button)findViewById(R.id.mul);
        div = (Button)findViewById(R.id.div);
        
        plus.setOnClickListener(new OnClickListener() {
            
            public void onClick(View v) {
                num1 = Double.parseDouble(t1.getText().toString());
                num2 = Double.parseDouble(t2.getText().toString());
                sum = num1 + num2;
                res.setText(Double.toString(sum));
            }
        });
        
        minus.setOnClickListener(new OnClickListener() {
            
            public void onClick(View v) {
                num1 = Double.parseDouble(t1.getText().toString());
                num2 = Double.parseDouble(t2.getText().toString());
                sum = num1 - num2;
                res.setText(Double.toString(sum));
            }
        });
        mul.setOnClickListener(new OnClickListener() {
            
            public void onClick(View v) {
                num1 = Double.parseDouble(t1.getText().toString());
                num2 = Double.parseDouble(t2.getText().toString());
                sum = num1 * num2;
                res.setText(Double.toString(sum));
            }
        });
        div.setOnClickListener(new OnClickListener() {
            
            public void onClick(View v) {
                num1 = Double.parseDouble(t1.getText().toString());
                num2 = Double.parseDouble(t2.getText().toString());
                sum = num1 / num2;
                res.setText(Double.toString(sum));
            }
        });
    } 
}