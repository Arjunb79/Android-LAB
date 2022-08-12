package com.example.arrayadapter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sum extends AppCompatActivity {
    EditText firstnum,secondnum;
    Button add;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);
        firstnum=(EditText) findViewById(R.id.first);
        secondnum=(EditText) findViewById(R.id.second);
        add=(Button) findViewById(R.id.add);
        result=(TextView) findViewById(R.id.tv);
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int n1,n2,n3;
                n1=Integer.parseInt(firstnum.getText().toString());
                n2=Integer.parseInt(secondnum.getText().toString());
                n3=n1+n2;
                result.setText(String.valueOf(n3));
            }
        });

    }
}
