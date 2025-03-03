package com.example.demolistview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvMonHoc;
    List<String> listMonHoc;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        lvMonHoc = findViewById(R.id.lvMonHoc); // nhap 2 thang lam 1

        //khoi tao du lieu
        listMonHoc = new ArrayList<>();
        listMonHoc.add("Lap trinh Java");
        listMonHoc.add("Lap trinh Java");
        listMonHoc.add("Lap trinh Java");
        listMonHoc.add("Lap trinh Java");
        listMonHoc.add("Lap trinh Java");
        listMonHoc.add("Lap trinh Java");

     adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listMonHoc);
    lvMonHoc.setAdapter(adapter);
    }
}