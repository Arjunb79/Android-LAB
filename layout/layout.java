package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText fname,lname,date,email,phone,pass;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.reg);
        fname = findViewById(R.id.fn);
        lname = findViewById(R.id.ln);
        date = findViewById(R.id.date);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        pass = findViewById(R.id.pass);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fname.length()==0){
                    Toast.makeText(MainActivity.this, "enter first name", Toast.LENGTH_SHORT).show();
                }
                if(lname.length()==0){
                    Toast.makeText(MainActivity.this, "enter last name", Toast.LENGTH_SHORT).show();
                }
                if(date.length()==0){
                    Toast.makeText(MainActivity.this, "enter dob", Toast.LENGTH_SHORT).show();
                }
                if(email.length()==0){
                    Toast.makeText(MainActivity.this, "enter email", Toast.LENGTH_SHORT).show();
                }
                if(phone.length()==0){
                    Toast.makeText(MainActivity.this, "enter phone number", Toast.LENGTH_SHORT).show();
                }
                if(pass.length()==0){
                    Toast.makeText(MainActivity.this, "enter the password", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "registered successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
