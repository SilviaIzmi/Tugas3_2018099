package com.example.a2018099_tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fresty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fartase);
    }
    public void fresty (View view){
        Intent a = new Intent(fresty.this, MainActivity.class);
        startActivity(a);
    }
    public void fartase (View view){
        Intent b = new Intent(fresty.this, fartase.class);
        startActivity(b);
    }
}