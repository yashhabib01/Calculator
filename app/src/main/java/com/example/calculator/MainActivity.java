package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8
            ,button9,buttonAdd,buttonSub,buttonDivision,buttonMul,button10,buttonC,buttonEqual;
    EditText editText;

    float mValueOne , mValueTwo;

    boolean addition,subtract,multiplication,division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        editText  = (EditText) findViewById(R.id.edt1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText() == null){
                    editText.setText("");
                }else {
                    if(!TextUtils.isEmpty(editText.getText().toString()) && editText.getText().toString().matches("\\d+(?:\\.\\d+)?")) {

                        mValueOne = Float.parseFloat(editText.getText() + "");
                        addition = true;
                        editText.setText(null);
                    }else {
                        Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!TextUtils.isEmpty(editText.getText().toString()) && editText.getText().toString().matches("\\d+(?:\\.\\d+)?")) {

                    mValueOne = Float.parseFloat(editText.getText() + "");
                    subtract = true;
                    editText.setText(null);
                }else {
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!TextUtils.isEmpty(editText.getText().toString()) && editText.getText().toString().matches("\\d+(?:\\.\\d+)?")) {

                    mValueOne = Float.parseFloat(editText.getText() + "");
                    multiplication = true;
                    editText.setText(null);
                }else {
                    Toast.makeText(MainActivity.this,"Invalid Input",Toast.LENGTH_SHORT).show();

                }
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!TextUtils.isEmpty(editText.getText().toString()) && editText.getText().toString().matches("\\d+(?:\\.\\d+)?")) {
                    mValueOne = Float.parseFloat(editText.getText() + "");
                    division = true;
                    editText.setText(null);
                }else {
                    Toast.makeText(MainActivity.this,"Invalid Input",Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!TextUtils.isEmpty(editText.getText().toString()) && editText.getText().toString().matches("\\d+(?:\\.\\d+)?") && mValueOne >= 0) {

                    mValueTwo = Float.parseFloat(editText.getText() + "");
                    if (addition == true) {
                        editText.setText(mValueOne + mValueTwo + "");
                        addition = false;
                    }
                    if (subtract == true) {
                        editText.setText(mValueOne - mValueTwo + "");
                        subtract = false;
                    }
                    if (multiplication == true) {
                        editText.setText(mValueOne * mValueTwo + "");
                        multiplication = false;
                    }
                    if (division == true) {
                        editText.setText(mValueOne / mValueTwo + "");
                        division = false;
                    }
                }
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });
    }
    }
