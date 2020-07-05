package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public double operand1;
    public String operator;
    public double operand2;
    public String check;

    public void add(View v){
        TextView t = findViewById(R.id.editTextNumber);
        check = t.getText().toString();
        if (check.isEmpty()){
            Toast.makeText(this, "No input found", Toast.LENGTH_LONG).show();
        }
        else{
        operand1 = Double.parseDouble(check);
        operator = " +";
        String message = operand1 + operator;
        ((TextView)findViewById(R.id.textView)).setText(message);
        ((TextView)findViewById(R.id.editTextNumber)).setText("");}
    }
    public void sub(View v){
        TextView t = findViewById(R.id.editTextNumber);
        check = t.getText().toString();
        if (check.isEmpty()){
            Toast.makeText(this, "No input found", Toast.LENGTH_LONG).show();
        }
        else{
        operand1 = Double.parseDouble(check);
        operator = " -";
        String message = operand1 + operator;
        ((TextView)findViewById(R.id.textView)).setText(message);
        ((TextView)findViewById(R.id.editTextNumber)).setText("");}
    }
    public void div(View v){
        TextView t = findViewById(R.id.editTextNumber);
        check = t.getText().toString();
        if (check.isEmpty()){
            Toast.makeText(this, "No input found", Toast.LENGTH_LONG).show();
        }
        else{
        operand1 = Double.parseDouble(check);
        operator = " /";
        String message = operand1 + operator;
        ((TextView)findViewById(R.id.textView)).setText(message);
        ((TextView)findViewById(R.id.editTextNumber)).setText("");}
    }
    public void mul(View v){
        TextView t = findViewById(R.id.editTextNumber);
        check = t.getText().toString();
        if (check.isEmpty()){
            Toast.makeText(this, "No input found", Toast.LENGTH_LONG).show();
        }
        else{
        operand1 = Double.parseDouble(check);
        operator = " *";
        String message = operand1 + operator;
        ((TextView)findViewById(R.id.textView)).setText(message);
        ((TextView)findViewById(R.id.editTextNumber)).setText("");}
    }

    public void result(View v) {
        TextView t = findViewById(R.id.editTextNumber);
        String check1 = t.getText().toString();

        if (check1.isEmpty()) {
            Toast.makeText(this, "No input found", Toast.LENGTH_LONG).show();
        }

        else if (operator == null){
            Toast.makeText(this, "select operator", Toast.LENGTH_LONG).show();
        }

        else {
            operand2 = Double.parseDouble(check1);
            switch (operator) {
                case " *": {
                    double ans = operand1 * operand2;
                    ((TextView) findViewById(R.id.textView)).setText(String.valueOf(ans));
                    ((TextView) findViewById(R.id.editTextNumber)).setText("");
                    break;
                }
                case " /": {
                    double ans = operand1 / operand2;
                    ((TextView) findViewById(R.id.textView)).setText(String.valueOf(ans));
                    ((TextView) findViewById(R.id.editTextNumber)).setText("");
                    break;
                }
                case " +": {
                    double ans = operand1 + operand2;
                    ((TextView) findViewById(R.id.textView)).setText(String.valueOf(ans));
                    ((TextView) findViewById(R.id.editTextNumber)).setText("");
                    break;
                }
                case " -": {
                    double ans = operand1 - operand2;
                    ((TextView) findViewById(R.id.textView)).setText(String.valueOf(ans));
                    ((TextView) findViewById(R.id.editTextNumber)).setText("");
                    break;
                }
                default:
                    Toast.makeText(this, "Operator not  found", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
}