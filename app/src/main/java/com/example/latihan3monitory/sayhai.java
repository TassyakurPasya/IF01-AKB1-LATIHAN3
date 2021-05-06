package com.example.latihan3monitory;
//04/05/2021, membuat tampilan sayhai, 10118009, Tassyakur Pasya, IF01
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class sayhai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sayhai);
        Intent intent = getIntent();
        String pesan = intent.getStringExtra(login.EXTRA_MESSAGE);

        TextView teks1 = findViewById(R.id.dua);
        teks1.setText(pesan);
        TextView teks2 = findViewById(R.id.enam);
        teks2.setText(pesan);
    }
}