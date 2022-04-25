package com.example.diansay_formulacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Triangle extends AppCompatActivity implements View.OnClickListener {
    Button btn_area, btn_base, btn_hgt, btn_calc;
    EditText txt_area, txt_base, txt_hgt;
    TextView txt_ans;
    double var1,var2,var3,ans;
    int Int;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area1);
        btn_area = findViewById(R.id.btn_area1);
        btn_base = findViewById(R.id.btn_base);
        btn_hgt = findViewById(R.id.btn_hgt);
        btn_calc = findViewById(R.id.btn_result);
        txt_area = findViewById(R.id.var1);
        txt_base = findViewById(R.id.var2);
        txt_hgt = findViewById(R.id.var3);
        txt_ans = findViewById(R.id.txt_res);
        btn_area.setOnClickListener(this);
        btn_base.setOnClickListener(this);
        btn_hgt.setOnClickListener(this);
        btn_calc.setOnClickListener(this);
        txt_area.setEnabled(false);
        txt_base.setEnabled(false);
        txt_hgt.setEnabled(false);
        btn_calc.setEnabled(false);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_area1:
                txt_area.setEnabled(false);
                btn_calc.setEnabled(true);
                txt_base.setEnabled(true);
                txt_hgt.setEnabled(true);
                Int = 0;
                break;
            case R.id.btn_base:
                txt_base.setEnabled(false);
                btn_calc.setEnabled(true);
                txt_hgt.setEnabled(true);
                txt_area.setEnabled(true);
                Int = 1;
                break;
            case R.id.btn_hgt:
                txt_hgt.setEnabled(false);
                btn_calc.setEnabled(true);
                txt_base.setEnabled(true);
                txt_area.setEnabled(true);
                Int = 2;
                break;
            case R.id.btn_result:
                switch(Int){
                    case 0:
                        var2 = Double.parseDouble(txt_base.getText().toString());
                        var3 = Double.parseDouble(txt_hgt.getText().toString());
                        ans = 0.5* var2 * var3;
                        txt_ans.setText("Answer: "+ans);
                        break;
                    case 1:
                        var1 = Double.parseDouble(txt_area.getText().toString());
                        var3 = Double.parseDouble(txt_hgt.getText().toString());
                        ans = 2* (var1/var3);
                        txt_ans.setText("Answer: "+ans);
                        break;
                    case 2:
                        var1 = Double.parseDouble(txt_area.getText().toString());
                        var2 = Double.parseDouble(txt_base.getText().toString());
                        ans = 2* (var1/var2);
                        txt_ans.setText("Answer: "+ans);
                        break;
                }
        }
    }
}