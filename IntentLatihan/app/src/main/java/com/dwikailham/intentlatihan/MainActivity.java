package com.dwikailham.intentlatihan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText eTnama, eTalamat, eTnohp;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String INPUT_NAME = "com.example.android.main2activity.input.NAME";
    public static final String INPUT_ALAMAT = "com.example.android.main2activity.input.ALAMAT";
    public static final String INPUT_NOHP = "com.example.android.main2activity.input.NOHP";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eTnama = findViewById(R.id.editText_nama);
        eTalamat = findViewById(R.id.editText_alamat);
        eTnohp = findViewById(R.id.editText_nohp);
    }

    public void sendRegister(View view) {
        Log.d(LOG_TAG, "Registered!");
        Intent intent = new Intent(this, Main2Activity.class);
        String nama = eTnama.getText().toString();
        String alamat = eTalamat.getText().toString();
        String nohp = eTnohp.getText().toString();
        intent.putExtra(INPUT_NAME,nama);
        intent.putExtra(INPUT_ALAMAT,alamat);
        intent.putExtra(INPUT_NOHP,nohp);
        startActivity(intent);
    }
}
