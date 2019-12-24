package com.example.exp1_calculator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class BinConversion extends AppCompatActivity implements View.OnClickListener {
    TextView txt_dec, txt_bib, txt_otc, txt_hex;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        txt_dec = findViewById(R.id.edt_dec);
        txt_bib = findViewById(R.id.edt_bin);
        txt_otc = findViewById(R.id.edt_otc);
        txt_hex = findViewById(R.id.edt_hex);

        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
        findViewById(R.id.btn_4).setOnClickListener(this);
        findViewById(R.id.btn_5).setOnClickListener(this);
        findViewById(R.id.btn_6).setOnClickListener(this);
        findViewById(R.id.btn_7).setOnClickListener(this);
        findViewById(R.id.btn_8).setOnClickListener(this);
        findViewById(R.id.btn_9).setOnClickListener(this);
        findViewById(R.id.btn_0).setOnClickListener(this);

        findViewById(R.id.btn_a).setOnClickListener(this);
        findViewById(R.id.btn_b).setOnClickListener(this);
        findViewById(R.id.btn_c).setOnClickListener(this);
        findViewById(R.id.btn_d).setOnClickListener(this);
        findViewById(R.id.btn_CE).setOnClickListener(this);

        findViewById(R.id.btn_tradec).setOnClickListener(this);
        findViewById(R.id.btn_trabin).setOnClickListener(this);
        findViewById(R.id.btn_traotc).setOnClickListener(this);
        findViewById(R.id.btn_trahex).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn_0:
                break;
            case R.id.btn_1:
                break;
            case R.id.btn_2:
                break;
            case R.id.btn_3:
                break;
            case R.id.btn_4:
                break;
            case R.id.btn_5:
                break;
            case R.id.btn_6:
                break;
            case R.id.btn_7:
                break;
            case R.id.btn_8:
                break;
            case R.id.btn_9:
                break;
            case R.id.btn_CE:
                break;
            case R.id.btn_a:
                break;
            case R.id.btn_b:
                break;
            case R.id.btn_c:
                break;
            case R.id.btn_d:
                break;

            case R.id.btn_tradec:
                break;
            case R.id.btn_trabin:
                break;
            case R.id.btn_traotc:
                break;
            case R.id.btn_trahex:
                break;
                default:
        }
    }


    //菜单
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
}

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.bin_item:
                Intent intent_bin = new Intent(BinConversion.this, BinConversion.class);
                startActivity(intent_bin);
                break;
            case R.id.len_item:
                Intent intetn_len = new Intent(BinConversion.this, LenConversion.class);
                startActivity(intetn_len);
                break;
            case R.id.vol_item:
                Intent intent_vol = new Intent(BinConversion.this, VolCompute.class);
                startActivity(intent_vol);
                break;
            case R.id.help_item:
                Intent intent_help = new Intent(BinConversion.this, Help.class);
                startActivity(intent_help);
                break;
        }
        return true;
    }


}
