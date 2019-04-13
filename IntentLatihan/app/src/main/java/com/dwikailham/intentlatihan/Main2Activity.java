package com.dwikailham.intentlatihan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    private EditText eTnama, eTalamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String nama = intent.getStringExtra(MainActivity.INPUT_NAME);
        String alamat = intent.getStringExtra(MainActivity.INPUT_ALAMAT);
        String nohp = intent.getStringExtra(MainActivity.INPUT_NOHP);

        eTnama = findViewById(R.id.main2_name);
        eTalamat = findViewById(R.id.main2_alamat);

        eTnama.setText(nama);
        eTalamat.setText(alamat);
    }

    public void onShare(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");

        String message = "Nama : "+eTnama.getText().toString()+"\nAlamat : "+eTalamat.getText().toString();

        intent.putExtra(Intent.EXTRA_TEXT, message);
        startActivity(Intent.createChooser(intent,"Share Using"));

    }
}
