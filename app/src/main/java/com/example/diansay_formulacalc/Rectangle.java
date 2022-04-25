package com.example.diansay_formulacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rectangle extends AppCompatActivity implements View.OnClickListener {
    Button btn_area, btn_len, btn_wid, btn_calc;
    EditText txt_area, txt_len, txt_wid;
    TextView txt_ans;
    double var1, var2, var3, ans;
    int Int;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area2);
        btn_area = findViewById(R.id.btn_area1);
        btn_len = findViewById(R.id.btn_len);
        btn_wid = findViewById(R.id.btn_wid);
        btn_calc = findViewById(R.id.btn_result);
        txt_area = findViewById(R.id.var1);
        txt_len = findViewById(R.id.var2);
        txt_wid = findViewById(R.id.var3);
        txt_ans = findViewById(R.id.txt_res);
        btn_area.setOnClickListener(this);
        btn_len.setOnClickListener(this);
        btn_wid.setOnClickListener(this);
        btn_calc.setOnClickListener(this);
        txt_area.setEnabled(false);
        txt_len.setEnabled(false);
        txt_wid.setEnabled(false);
        btn_calc.setEnabled(false);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_area1:
                txt_area.setEnabled(false);
                btn_calc.setEnabled(true);
                txt_len.setEnabled(true);
                txt_wid.setEnabled(true);
                Int = 0;
                break;
            case R.id.btn_len:
                txt_len.setEnabled(false);
                btn_calc.setEnabled(true);
                txt_wid.setEnabled(true);
                txt_area.setEnabled(true);
                Int = 1;
                break;
            case R.id.btn_wid:
                txt_wid.setEnabled(false);
                btn_calc.setEnabled(true);
                txt_len.setEnabled(true);
                txt_area.setEnabled(true);
                Int = 2;
                break;
            case R.id.btn_result:
                switch (Int) {
                    case 0:
                        var2 = Double.parseDouble(txt_len.getText().toString());
                        var3 = Double.parseDouble(txt_wid.getText().toString());
                        ans = var2 * var3;
                        txt_ans.setText("Answer: " + ans);
                        break;
                    case 1:
                        var1 = Double.parseDouble(txt_area.getText().toString());
                        var3 = Double.parseDouble(txt_wid.getText().toString());
                        ans = var1 / var3;
                        txt_ans.setText("Answer: " + ans);
                        break;
                    case 2:
                        var1 = Double.parseDouble(txt_area.getText().toString());
                        var2 = Double.parseDouble(txt_len.getText().toString());
                        ans = var1 / var2;
                        txt_ans.setText("Answer: " + ans);
                }
        }
    }
}