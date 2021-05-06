package com.example.latihan3monitory;
//04/05/2021, membuat Kode keluarga, 10118009, Tassyakur Pasya, IF01
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kodekeluarga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logincode);
    }
    public void Biodata(View view) {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }
}