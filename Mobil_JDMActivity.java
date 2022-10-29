package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MakananActivity extends AppCompatActivity {

    ListView listView;
    Spinner combo;

    public String Menu_Makanan [] = {" ","Nissan Skyine R34", "Toyota Supra MK4", "Toyota AE86 Trueno", "Mitsubishi Lancer EVO VIII", "Toyota Celica","Nissan Cefiro", "Subaru Impreza GC8","Mazda RX-7", "Mazda RX-8"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);

        listView = (ListView) findViewById(R.id.listmakanan);
        combo = (Spinner) findViewById(R.id.combomakanan);

        ArrayAdapter adapter = new ArrayAdapter(MakananActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, Menu_Makanan);
        listView.setAdapter(adapter);
        combo.setAdapter(adapter);
    }
}