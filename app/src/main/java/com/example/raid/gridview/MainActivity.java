package com.example.raid.gridview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends Activity {
    private String[] nama = {"Haqi","Bambang","Fani","Sukidi","Jauhar","Dany","Kevin","Rakha"};
    private GridView grid1;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid1 = (GridView) findViewById(R.id.gridView1);
        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, nama);
        grid1.setAdapter(adapter);
    }
}