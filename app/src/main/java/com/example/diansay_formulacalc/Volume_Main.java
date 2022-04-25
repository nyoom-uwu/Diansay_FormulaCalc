package com.example.diansay_formulacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Volume_Main extends AppCompatActivity implements View.OnClickListener {

    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_main);
        b1 = findViewById(R.id.btn_cyl);
        b2 = findViewById(R.id.btn_sph);
        b3 = findViewById(R.id.btn_con);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_cyl:
                startActivity(new Intent(this, Cylinder.class));
                break;
            case R.id.btn_sph:
                startActivity(new Intent(this, Sphere.class));
                break;
            case R.id.btn_con:
                startActivity(new Intent(this, Cone.class));
                break;
        }
    }
}