package com.example.a2018099_tugas3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fartase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joly);
    }
    public void fartase (View view){
        Intent a = new Intent(fartase.this, MainActivity.class);
        startActivity(a);
    }
    public void joly (View view){
        Intent b = new Intent(fartase.this, joly.class);
        startActivity(b);
    }
}