package com.example.india.nanodegree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void action(View v){
        if(v.getId()==R.id.button){
            Toast.makeText(MainActivity.this, "This button will launch my Spotify Streamer App", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId()==R.id.button2){
            Toast.makeText(MainActivity.this,"This button will launch my Super Duo App",Toast.LENGTH_SHORT).show();
        }
        else if(v.getId()==R.id.button3){
            Toast.makeText(MainActivity.this,"This button will launch my Build It Bigger App",Toast.LENGTH_SHORT).show();
        }
        else  if(v.getId()==R.id.button4){
            Toast.makeText(MainActivity.this,"This button will launch my XYZ reader App",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this,"This button will launch my Capstone project app",Toast.LENGTH_SHORT).show();
        }

    }
}
