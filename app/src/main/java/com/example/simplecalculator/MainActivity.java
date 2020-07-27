package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Typeface;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //declare elements
    EditText edtNumber1;
    EditText edtNumber2;
    TextView txtResult;
    Typeface monofettFont;
    Typeface tekoFont;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNumber1 = (EditText) findViewById(R.id.edtNumber1);
        edtNumber2 = (EditText) findViewById(R.id.edtNumber2);

        txtResult = (TextView) findViewById(R.id.txtResult);
        monofettFont = Typeface.createFromAsset(getAssets(), "fonts/Monofett-Regular.ttf");
        tekoFont = Typeface.createFromAsset(getAssets(), "fonts/Teko-Regular.ttf");

        //Apply Fonts

        edtNumber1.setTypeface(tekoFont);
        edtNumber2.setTypeface(tekoFont);
        txtResult.setTypeface(monofettFont);

    }
}

