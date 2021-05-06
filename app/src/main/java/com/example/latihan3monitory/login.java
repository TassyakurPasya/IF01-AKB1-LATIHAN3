package com.example.latihan3monitory;
//04/05/2021, membuat tampilan login, 10118009, Tassyakur Pasya, IF01
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {
public static final String EXTRA_MESSAGE = "com.example.latihan3monitory.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biodata);
    }
    public void Sayhai(View view) {
        Intent intent = new Intent(this, sayhai.class);
        EditText editText = findViewById(R.id.cnthnama);
        String pesan = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,pesan);
        startActivity(intent);

    }

}