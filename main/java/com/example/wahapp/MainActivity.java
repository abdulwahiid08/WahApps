package com.example.wahapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_menu);
    }

    public void clickRs(View view) {
        //event Click di gambar
        Intent rs = new Intent(this, RS.class);
        startActivity(rs);
    }
}