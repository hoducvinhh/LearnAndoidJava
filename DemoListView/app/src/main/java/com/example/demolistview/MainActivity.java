package com.example.demolistview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

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
    Button btn_Add,btn_Edit;
    EditText edt_MonHoc;
    int index = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        lvMonHoc = findViewById(R.id.lvMonHoc); // nhap 2 thang lam 1
        btn_Add = findViewById(R.id.btn_Add); // nhap 2 thang lam 1
        btn_Edit= findViewById(R.id.btn_Edit); // nhap 2 thang lam 1
        edt_MonHoc = findViewById(R.id.edt_MonHoc); // nhap 2 thang lam 1

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
    lvMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
           // Toast.makeText(MainActivity.this, "Vi tri click: "+ position , Toast.LENGTH_SHORT).show();
            String monHoc = listMonHoc.get(position);
            edt_MonHoc.setText(monHoc);
            index = position;
        }
    });
    }

public void addMonHoc(View view)
{
    String monHoc = edt_MonHoc.getText().toString();
    listMonHoc.add(monHoc);
    adapter.notifyDataSetChanged(); // bao cho listview biet du  lieu trong adapter da thay doi, can load lai du lieu

}

public void editMonHoc(View view)
{
    String monHoc = edt_MonHoc.getText().toString();
    listMonHoc.set(index, monHoc);
    adapter.notifyDataSetChanged();
}

}