package com.example.diansay_formulacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Cylinder extends AppCompatActivity implements View.OnClickListener {
    Button btn_vol, btn_rad, btn_hgt, btn_calc;
    EditText txt_vol, txt_rad, txt_hgt;
    TextView txt_ans;
    double var1,var2,var3, ans;
    int Int;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume1);
        btn_vol = findViewById(R.id.btn_area1);
        btn_rad = findViewById(R.id.btn_rad);
        btn_hgt = findViewById(R.id.btn_hgt);
        btn_calc = findViewById(R.id.btn_result);
        txt_vol = findViewById(R.id.var1);
        txt_rad = findViewById(R.id.var2);
        txt_hgt = findViewById(R.id.var3);
        txt_ans = findViewById(R.id.txt_res);
        btn_vol.setOnClickListener(this);
        btn_rad.setOnClickListener(this);
        btn_hgt.setOnClickListener(this);
        btn_calc.setOnClickListener(this);
        txt_vol.setEnabled(false);
        txt_rad.setEnabled(false);
        txt_hgt.setEnabled(false);
        btn_calc.setEnabled(false);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_area1:
                txt_vol.setEnabled(false);
                btn_calc.setEnabled(true);
                txt_rad.setEnabled(true);
                txt_hgt.setEnabled(true);
                Int = 0;
                break;
            case R.id.btn_rad:
                txt_rad.setEnabled(false);
                btn_calc.setEnabled(true);
                txt_hgt.setEnabled(true);
                txt_vol.setEnabled(true);
                Int = 1;
                break;
            case R.id.btn_hgt:
                txt_hgt.setEnabled(false);
                btn_calc.setEnabled(true);
                txt_rad.setEnabled(true);
                txt_vol.setEnabled(true);
                Int = 2;
                break;
            case R.id.btn_result:
                switch (Int) {
                    case 0:
                        var2 = Double.parseDouble(txt_rad.getText().toString());
                        var3 = Double.parseDouble(txt_hgt.getText().toString());
                        ans = Math.PI * var2 * var2 * var3;
                        txt_ans.setText("Answer: " + ans);
                        break;
                    case 1:
                        var1 = Double.parseDouble(txt_vol.getText().toString());
                        var3 = Double.parseDouble(txt_hgt.getText().toString());
                        ans = Math.sqrt((var1 / Math.PI / var3));
                        txt_ans.setText("Answer: " + ans);
                        break;
                    case 2:
                        var1 = Double.parseDouble(txt_vol.getText().toString());
                        var2 = Double.parseDouble(txt_rad.getText().toString());
                        ans = (var1 / var2 / var2 / Math.PI) ;
                        txt_ans.setText("Answer: " + ans);
                        break;
                }
        }
    }
}