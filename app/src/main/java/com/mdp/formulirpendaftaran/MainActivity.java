package com.mdp.formulirpendaftaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn_Daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Daftar = findViewById(R.id.btn_daftar);
        btn_Daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //tampilkan toast "Anda berhasil terdaftar!"
                Toast.makeText(MainActivity.this,"Anda Berhasil Terdaftar !",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}