package com.example.dila.pedulipendidikan_dila;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SekolahActivity extends AppCompatActivity {

    CustomAdapter adapter;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sekolah);

        lv = (ListView) findViewById(R.id.lv);
        adapter = new CustomAdapter(this, getData());
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent kebdg = new Intent(SekolahActivity.this,almukhlisin.class);
                        startActivity(kebdg);
                        Toast.makeText(getApplicationContext(),"Madrasah Al-Mukhlisin", Toast.LENGTH_SHORT).show();
                        break;

                    case 1:
                        Intent kebali = new Intent(SekolahActivity.this,ciganitri.class);
                        startActivity(kebali);
                        Toast.makeText(getApplicationContext(),"Pondok Pesantren Ciganitri", Toast.LENGTH_SHORT).show();

                        break;

                    case 2:
                        Intent kepdg = new Intent(SekolahActivity.this,cipagalo.class);
                        startActivity(kepdg);
                        Toast.makeText(getApplicationContext(),"SDN Cipagalo", Toast.LENGTH_SHORT).show();

                        break;
                    case 3:
                        Intent kesby = new Intent(SekolahActivity.this,dayeuhkolot.class);
                        startActivity(kesby);
                        Toast.makeText(getApplicationContext(),"SDN Dayeuhkolot VI", Toast.LENGTH_SHORT).show();

                        break;
                    case 4:
                        Intent kebgr = new Intent(SekolahActivity.this,sukbir.class);
                        startActivity(kebgr);
                        Toast.makeText(getApplicationContext(),"SDN Sukabirus", Toast.LENGTH_SHORT).show();

                        break;
                }

            }
        });

    }

    private ArrayList getData() {
        ArrayList<Spacecraft> spacecrafts = new ArrayList<>();

        Spacecraft s = new Spacecraft();
        s.setName("Madrasah Al-Mukhlisin");
        s.setPropellant("Gang PGA");
        s.setImage(R.drawable.almukhlisin);
        spacecrafts.add(s);

        s = new Spacecraft();
        s.setName("Pondok Pesantren Ciganitri");
        s.setPropellant("Kecamatan Bandung");
        s.setImage(R.drawable.ciganitri);
        spacecrafts.add(s);

        s = new Spacecraft();
        s.setName("SDN Cipagalo ");
        s.setPropellant("Kecamatan Bojongsoang");
        s.setImage(R.drawable.cipagalo);
        spacecrafts.add(s);

        s = new Spacecraft();
        s.setName("SDN Dayeuhkolot VI");
        s.setPropellant("Kecamatan Dayeuhkolot");
        s.setImage(R.drawable.dayeuhkolot);
        spacecrafts.add(s);

        s = new Spacecraft();
        s.setName("SDN Sukabirus");
        s.setPropellant("Kabupaten Bandung");
        s.setImage(R.drawable.sukbir);
        spacecrafts.add(s);

        return spacecrafts;
    }
}