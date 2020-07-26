package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import android.widget.TextView;
import android.graphics.Typeface;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //declare elements
    TextInputEditText edtNumber1;
    TextInputEditText edtNumber2;
    TextView txtResult;
    Typeface monofettFont;
    Typeface tekoFont;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNumber1 = (TextInputEditText) findViewById(R.id.edtNumber1);
        edtNumber2 = (TextInputEditText) findViewById(R.id.edtNumber2);

        txtResult = (TextView) findViewById(R.id.txtResult);
        monofettFont = Typeface.createFromAsset(getAssets(), "fonts/Monofett-Regular.ttf");
        tekoFont = Typeface.createFromAsset(getAssets(), "fonts/Teko-Regular.ttf");

        //Apply Fonts

        edtNumber1.setTypeface(tekoFont);
        edtNumber2.setTypeface(tekoFont);
        txtResult.setTypeface(monofettFont);

    }
}

