package com.example.exp1_calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Vol_Compute extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vol_compute);
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
                Intent intent_bin = new Intent(Vol_Compute.this, Bin_Conversion.class);
                startActivity(intent_bin);
                break;
            case R.id.len_item:
                Intent intetn_len = new Intent(Vol_Compute.this, Len_Conversion.class);
                startActivity(intetn_len);
                break;
            case R.id.vol_item:
                Intent intent_vol = new Intent(Vol_Compute.this, Vol_Compute.class);
                startActivity(intent_vol);
                break;
            case R.id.help_item:
                Intent intent_help = new Intent(Vol_Compute.this, Help.class);
                startActivity(intent_help);
                break;
        }
        return true;
    }
}
