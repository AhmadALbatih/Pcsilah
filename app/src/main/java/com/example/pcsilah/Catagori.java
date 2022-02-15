package com.example.pcsilah;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageView;
import android.os.Bundle;

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
        CASES =(Button) findViewById(R.id.buttoncase);
        RAM =(Button) findViewById(R.id.buttonram);
        HD =(Button) findViewById(R.id.buttonhd);
        GPU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Catagori.this,cpu.class);
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
        CASES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Catagori.this,cpu.class);
                startActivity(i);
            }
        });
        RAM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Catagori.this,cpu.class);
                startActivity(i);
            }
        });
        HD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Catagori.this,cpu.class);
                startActivity(i);
            }
        });
    }
}