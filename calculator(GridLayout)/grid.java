package com.example.grid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    String on="";
    String op="+";
    boolean isNewOp=true;
    EditText e;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=findViewById(R.id.num);
    }
    public void NumberEvent(View view){
        if(isNewOp){
            e.setText("");
        }
        isNewOp=false;
        String n=e.getText().toString();
        switch (view.getId()){
            case R.id.b1:
                n+="1";
                break;
            case R.id.b2:
                n+="2";
                break;
            case R.id.b3:
                n+="3";
                break;
            case R.id.b4:
                n+="4";
                break;
            case R.id.b5:
                n+="5";
                break;
            case R.id.b6:
                n+="6";
                break;
            case R.id.b7:
                n+="7";
                break;
            case R.id.b8:
                n+="8";
                break;
            case R.id.b9:
                n+="9";
                break;
            case R.id.b0:
                n+="0";
                break;
            case R.id.clear:
                n+="";
                break;
        }
        e.setText(n);
    }

    public void OperatorEvent(View view){
        isNewOp=true;
        on=e.getText().toString();
        switch (view.getId()){
            case R.id.add:
                op="+";
                break;
            case R.id.sub:
                op="-";
                break;
            case R.id.mul:
                op="*";
                break;
            case R.id.div:
                op="/";
                break;
        }
    }

    public void EqualEvent(View view){
        String newnum=e.getText().toString();
        double res=0.0;
        switch (op){
            case "+":
                res=Double.parseDouble(on)+Double.parseDouble(newnum);
                break;
            case "-":
                res=Double.parseDouble(on)-Double.parseDouble(newnum);
                break;
            case "*":
                res=Double.parseDouble(on)*Double.parseDouble(newnum);
                break;
            case "/":
                res=Double.parseDouble(on)/Double.parseDouble(newnum);
        }
        e.setText(res+"");
    }
}
