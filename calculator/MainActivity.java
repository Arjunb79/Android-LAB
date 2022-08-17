package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText n1,n2;
    private Button b1,b2,b3,b4;
    private TextView r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.num1);
        n2 = (EditText) findViewById(R.id.num2);
        b1 = (Button) findViewById(R.id.add);
        b2 = (Button) findViewById(R.id.sub);
        b3 = (Button) findViewById(R.id.mul);
        b4 = (Button) findViewById(R.id.div);
        r = (TextView) findViewById(R.id.result);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1, num2, num3;
                num1 = Integer.parseInt(n1.getText().toString());
                num2 = Integer.parseInt(n2.getText().toString());
                num3 = num1 + num2;
                r.setText(String.valueOf(num3));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1, num2, num3;
                num1 = Integer.parseInt(n1.getText().toString());
                num2 = Integer.parseInt(n2.getText().toString());
                num3 = num1 - num2;
                r.setText(String.valueOf(num3));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1, num2, num3;
                num1 = Integer.parseInt(n1.getText().toString());
                num2 = Integer.parseInt(n2.getText().toString());
                num3 = num1 * num2;
                r.setText(String.valueOf(num3));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1, num2, num3;
                num1 = Integer.parseInt(n1.getText().toString());
                num2 = Integer.parseInt(n2.getText().toString());
                num3 = num1 / num2;
                r.setText(String.valueOf(num3));
            }
        });
    }
}
