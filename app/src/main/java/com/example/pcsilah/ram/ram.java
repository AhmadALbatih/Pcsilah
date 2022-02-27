package com.example.pcsilah.ram;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pcsilah.R;

import java.util.ArrayList;
import java.util.List;

public class ram extends AppCompatActivity {
	private List<ramclass> ramList;
	private RamAdapter ramAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ram);
		ramList = new ArrayList<>();
		ramList.add(new ramclass("Patriot Memory", "4400 MHz","(2X8) 16 GB","DDR4","1.45 Volts", R.drawable.patriotmemory));
		ramList.add(new ramclass("Corsair", "3600 MHz","16 GB","DDR4","1.35 Volts", R.drawable.corsair));
		ramList.add(new ramclass("Crucial", "2666 MHz","64 GB","DDR4","1.2 Volts", R.drawable.crucial));
		ramList.add(new ramclass("TEAMGROUP", "3600 MHz","16 GB","DDR4","1.35 Volts", R.drawable.teamgroup));
		ramList.add(new ramclass("TUF Gaming Alliance (TEAMGROUP)", "3000 MHz","16 GB","DDR4","1.35 Volts", R.drawable.tufgamingallianceteamgroup));
		ramList.add(new ramclass("PNY", "3200 MHz","16 GB","DDR4","1.35 Volts", R.drawable.pny));
		ramList.add(new ramclass("XPG", "5200 MHz","32 GB","DDR5","1.25 Volts", R.drawable.xpg));
		ramList.add(new ramclass("Patriot Memory", "4400 MHz","16 GB","DDR4","1.45 Volts", R.drawable.patriotmemory));
		ramAdapter = new RamAdapter(this, 0, ramList);
		ListView listView = (ListView) findViewById(R.id.names_list_view);
		listView.setAdapter(ramAdapter);


	}
}