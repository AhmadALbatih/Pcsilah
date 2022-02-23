package com.example.pcsilah;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

import com.example.pcsilah.cpu.cpu;
import com.example.pcsilah.gpu.gpu;
import com.example.pcsilah.ram.ram;
import com.example.pcsilah.harddesk.harddisk;

public class Catagori extends AppCompatActivity {
    Button GPU;
    Button CPU;
    Button CASES;
    Button RAM;
    Button HD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagori);
        GPU=(Button) findViewById(R.id.buttongpu);
        CPU =(Button) findViewById(R.id.buttoncpu);
        RAM =(Button) findViewById(R.id.buttonram);
        HD =(Button) findViewById(R.id.buttonhd);
        GPU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Catagori.this, gpu.class);
                startActivity(i);
            }
        });
        CPU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Catagori.this,cpu.class);
                startActivity(i);
            }
        });
        RAM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Catagori.this,ram.class);
                startActivity(i);
            }
        });
        HD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Catagori.this,harddisk.class);
                startActivity(i);
            }
        });
    }
}