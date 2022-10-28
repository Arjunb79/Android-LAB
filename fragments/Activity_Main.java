package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();

        Button btn=findViewById(R.id.b1);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, chat.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack(null)
                        .commit();
            }
        });

        Button btn2=findViewById(R.id.b2);
        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, status.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack(null)
                        .commit();
            }
        });


        Button btn3=findViewById(R.id.b3);
        btn3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, call.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack(null)
                        .commit();
            }
        });

    }
}
