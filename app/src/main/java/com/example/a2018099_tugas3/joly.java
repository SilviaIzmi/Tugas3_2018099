package com.example.a2018099_tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class joly extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresty);
    }
    public void joly (View view){
        Intent a = new Intent(joly.this, MainActivity.class);
        startActivity(a);
    }
    public void fresty (View view){
        Intent b = new Intent(joly.this, fresty.class);
        startActivity(b);
    }

}