package com.androidhehe.riga.damarauriga_1202150007_modul4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonList, buttonCari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCari = (Button)findViewById(R.id.btn_cari_gambar);
        buttonList = (Button)findViewById(R.id.btn_list_mahasiswa);

        buttonCari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cari = new Intent (MainActivity.this, CariGambar.class);
                startActivity(cari);
            }

        });

        buttonList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent list = new Intent(MainActivity.this, ListMahasiswa.class);
                startActivity(list);
            }
        });
    }
}
