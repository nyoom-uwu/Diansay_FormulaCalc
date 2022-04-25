package com.example.diansay_formulacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Circle extends AppCompatActivity implements View.OnClickListener {
    Button btn_area, btn_rad, btn_calc;
    EditText txt_area, txt_rad;
    TextView txt_ans;
    double var1,var2, ans;
    int Int;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area3);
        btn_area = findViewById(R.id.btn_area1);
        btn_rad = findViewById(R.id.btn_rad);
        btn_calc = findViewById(R.id.btn_result);
        txt_area = findViewById(R.id.var1);
        txt_rad = findViewById(R.id.var2);
        txt_ans = findViewById(R.id.txt_res);
        btn_area.setOnClickListener(this);
        btn_rad.setOnClickListener(this);
        btn_calc.setOnClickListener(this);
        txt_area.setEnabled(false);
        txt_rad.setEnabled(false);
        btn_calc.setEnabled(false);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_area1:
                txt_area.setEnabled(false);
                btn_calc.setEnabled(true);
                txt_rad.setEnabled(true);
                Int = 0;
                break;
            case R.id.btn_rad:
                txt_rad.setEnabled(false);
                btn_calc.setEnabled(true);
                txt_area.setEnabled(true);
                Int = 1;
                break;
            case R.id.btn_result:
                switch (Int) {
                    case 0:
                        var2 = Double.parseDouble(txt_rad.getText().toString());
                        ans = var2 * var2 * Math.PI;
                        txt_ans.setText("Answer: " + ans);
                        break;
                    case 1:
                        var1 = Double.parseDouble(txt_area.getText().toString());
                        ans = Math.sqrt(var1 / Math.PI);
                        txt_ans.setText("Answer: " + ans);
                        break;
                }
        }
    }
}