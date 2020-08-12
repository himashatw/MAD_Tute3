package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    EditText editText1,editText2;
    TextView textView;
    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText1=findViewById(R.id.inputN1);
        editText2=findViewById(R.id.inputN2);
        textView=findViewById(R.id.txtOutput);

        btn1=findViewById(R.id.btnAddition);
        btn2=findViewById(R.id.btnSubstraction);
        btn3=findViewById(R.id.btnMultiplication);
        btn4=findViewById(R.id.btnDivision);


        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();

        String number1=bundle.getString("inputN1");
        String number2=bundle.getString("inputN2");

        final double num1=Double.parseDouble(number1);
        final double num2=Double.parseDouble(number2);

        editText1.setText(number1);
        editText2.setText(number2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(num1+" + "+num2+" = "+(num1+num2));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(num1+" - "+num2+" = "+(num1-num2));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(num1+" * "+num2+" = "+(num1*num2));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(num1+" / "+num2+" = "+(num1/num2));
            }
        });



    }
}