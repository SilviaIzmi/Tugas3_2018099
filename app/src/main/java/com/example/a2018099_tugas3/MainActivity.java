package com.example.a2018099_tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void fartase(View view){
        Intent a = new Intent(MainActivity.this, fartase.class);
        startActivity(a);
    }
    public void fresty (View view){
        Intent a = new Intent(MainActivity.this, fresty.class);
        startActivity(a);
    }
    public void joly(View view){
        Intent a = new Intent(MainActivity.this, joly.class);
        startActivity(a);
    }
}