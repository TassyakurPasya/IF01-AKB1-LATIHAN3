package com.example.latihan3monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman1);
    }
    public void Kode(View view) {
        Intent intent = new Intent(this, kodekeluarga.class);
        startActivity(intent);
    }
}