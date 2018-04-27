package com.example.dila.pedulipendidikan_dila;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mbtKajian, mbtUstadz,mbtSedekah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtKajian = findViewById(R.id.buku);
        mbtUstadz = findViewById(R.id.sekolah);
        mbtSedekah = findViewById(R.id.baju);
    }

    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.buku:
                //do ur code
                Toast.makeText(this,"Info Donasi Buku",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,HomeActivity.class);
                startActivity(intent);
                break;

            case R.id.sekolah:
                intent = new Intent(this, SekolahActivity.class);
                startActivity(intent);
                break;
            case R.id.baju:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);

                break;
            default:
                //do ur code;
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
        }
    }
}