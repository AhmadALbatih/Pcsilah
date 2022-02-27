package com.example.pcsilah.gpu;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pcsilah.R;

import java.util.ArrayList;
import java.util.List;

public class gpu extends AppCompatActivity {
	private List<gpuclass> gpuList;
	private GpuAdapter gpuAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gpu);
		gpuList = new ArrayList<>();
		gpuList.add(new gpuclass("Nvidia", "GeForce GTX 1650", "Nvidia", "4 GB","GDDR6","1485 MHz","2001 MHz ","128GB/s",R.drawable.gtx1650));
		gpuList.add(new gpuclass("Nvidia", "GeForce GTX 1660", "Nvidia", "6 GB","GDDR5","1530 MHz","2001 MHz","192 GB/s",R.drawable.gtx1660));
		gpuList.add(new gpuclass("Nvidia", "GeForce RTX 2060", "Nvidia", "6 GB","GDDR6","1365 MHz","1750 MHz","336 GB/s",R.drawable.rtx2060));
		gpuList.add(new gpuclass("Nvidia", "GeForce RTX 2070", "Nvidia", "8 GB","GDDR6","1410 MHz","1750 MHz","448 GB/s",R.drawable.rtx2070));
		gpuList.add(new gpuclass("Nvidia", "GeForce RTX 2080", "Nvidia", "8 GB","GDDR6","1515 MHz","1750 MHz","448 GB/s",R.drawable.rtx2080));
		gpuList.add(new gpuclass("Nvidia", "GeForce RTX 3060", "Nvidia", "12 GB","GDDR6","1320 MHz","1875 MHz","360 GB/s",R.drawable.rtx3060));
		gpuList.add(new gpuclass("Nvidia", "GeForce RTX 3070", "Nvidia", "8 GB","GDDR6X","1575 MHz","1188 MHz","608 GB/s",R.drawable.rtx3070));
		gpuList.add(new gpuclass("Nvidia", "GeForce RTX 3080", "Nvidia", "10 GB","GDDR6X","1440 MHz","1188 MHz","760 GB/s",R.drawable.rtx3080));
		gpuList.add(new gpuclass("AMD", "Radeon RX 6900 XT", "AMD", "16 GB","GDDR6","1875 MHz","2000 MHz","512 GB/s",R.drawable.radeonrx6900xt));
		gpuList.add(new gpuclass("AMD", "Radeon HD 7970", "AMD", "3 GB","GDDR5","1000 MHz","1500 MHz","288 GB/s",R.drawable.radeonhd7970));
		gpuList.add(new gpuclass("AMD", "Radeon RX 5700", "AMD", "8 GB","GDDR6","1465 MHz","1750 MHz","448 GB/s",R.drawable.radeonrx5700));
		gpuList.add(new gpuclass("AMD", "Radeon RX Vega 56", "AMD", "8 GB","HBM2","1156 MHz","800 MHz","409 GB/s",R.drawable.radeonrxvega56));
		gpuAdapter = new GpuAdapter(this, 0, gpuList);
		ListView listView = (ListView) findViewById(R.id.names_list_view);
		listView.setAdapter(gpuAdapter);


	}
}