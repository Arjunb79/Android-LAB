package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText n1,n2,dob,email,phone,pass;
    private Button b;
    String fs,ls,db,mob,ml,psw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=(EditText) findViewById(R.id.fn);
        n2=(EditText) findViewById(R.id.ln);
        dob=(EditText) findViewById(R.id.date);
        email=(EditText) findViewById(R.id.email);
        phone=(EditText) findViewById(R.id.phone);
        pass=(EditText) findViewById(R.id.pass);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    fs=n1.getText().toString().trim();
                    ls=n2.getText().toString().trim();
                    db=dob.getText().toString().trim();
                    mob=phone.getText().toString().trim();
                    ml=email.getText().toString().trim();
                    psw=pass.getText().toString().trim();
                    if(fs.equals(" ")){
                        Toast.makeText(MainActivity.this, "enter the first name", Toast.LENGTH_SHORT).show();
                    }
                    else if(ls.equals(" ")){
                        Toast.makeText(MainActivity.this, "enter the last name", Toast.LENGTH_SHORT).show();
                    }
            }
        });
    }
}
