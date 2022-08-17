package com.example.activity_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle","onCreate invoked");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "onStart called", Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle","OnStart called");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "onResume called", Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle","OnResume called");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "onPause called", Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle","onPause Called");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "onStop called", Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle","onStop Called");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "onRestart called", Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle","onRestart Called");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "onDestroy called", Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle","onDestroy Called");
    }


}
