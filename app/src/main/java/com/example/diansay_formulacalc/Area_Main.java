package com.example.diansay_formulacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Area_Main extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_main);
        b1 = findViewById(R.id.btn_tri);
        b2 = findViewById(R.id.btn_rec);
        b3 = findViewById(R.id.btn_cir);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_tri:
                startActivity(new Intent(this, Triangle.class));
                break;
            case R.id.btn_rec:
                startActivity(new Intent(this, Rectangle.class));
                break;
            case R.id.btn_cir:
                startActivity(new Intent(this, Circle.class));
                break;
        }
    }
}