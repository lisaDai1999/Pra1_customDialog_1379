package com.example.exp1_calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class LenConversion extends AppCompatActivity {


    //右上角菜单
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.bin_item:
                Intent intent_bin = new Intent(LenConversion.this, BinConversion.class);
                startActivity(intent_bin);
                break;
            case R.id.len_item:
                Intent intetn_len = new Intent(LenConversion.this, LenConversion.class);
                startActivity(intetn_len);
                break;
            case R.id.vol_item:
                Intent intent_vol = new Intent(LenConversion.this, VolCompute.class);
                startActivity(intent_vol);
                break;
            case R.id.help_item:
                Intent intent_help = new Intent(LenConversion.this, Help.class);
                startActivity(intent_help);
                break;
        }
        return true;
    }
}
