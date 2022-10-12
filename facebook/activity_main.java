package com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.un);
        e2=findViewById(R.id.pass);
    }
    public void login(View view){
        String name=e1.getText().toString().trim();
        String pass=e2.getText().toString().trim();
        if(name.isEmpty()){
            e1.setError("enter the username or phone");
        }
        else if(pass.isEmpty()){
            e2.setError("enter the password");
        }
        else{
            Intent in=new Intent(this,Activity3.class);
            startActivity(in);
        }

    }
    public void create(View view){
        Intent sign=new Intent(this, Activity2.class);
        startActivity(sign);
    }
}
