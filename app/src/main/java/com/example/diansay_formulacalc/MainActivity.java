package com.example.diansay_formulacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button Area,Volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Area = findViewById(R.id.button);
        Volume = findViewById(R.id.button2);
        Area.setOnClickListener(this);
        Volume.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                startActivity(new Intent(this, Area_Main.class));
                break;
            case R.id.button2:
                startActivity(new Intent(this, Volume_Main.class));
        }
    }
}