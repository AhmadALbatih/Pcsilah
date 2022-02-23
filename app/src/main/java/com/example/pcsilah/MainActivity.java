package com.example.pcsilah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

import com.example.pcsilah.gpu.gpu;

public class MainActivity extends AppCompatActivity {
    Button trails;
    Button info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trails=(Button) findViewById(R.id.buttont);
        info =(Button) findViewById(R.id.buttoninfo);
        trails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, demo_m.class);
                startActivity(i);
            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Catagori.class);
                startActivity(i);
            }
        });

    }
}