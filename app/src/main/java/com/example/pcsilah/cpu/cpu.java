package com.example.pcsilah.cpu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.pcsilah.R;

import java.util.ArrayList;
import java.util.List;

public class cpu extends AppCompatActivity {
	private List<cpuclass> cpuList;
	private CpuAdapter cpuAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cpu);
		cpuList = new ArrayList<>();
		cpuList.add(new cpuclass("Intel", "i3-8100","4 cores,","3.60 GHz","6 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.inteli38100));
		cpuList.add(new cpuclass("Intel", "i5-8500","6 cores,","3.00 GHz","9 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.inteli58500));
		cpuList.add(new cpuclass("Intel", "i7-8700","6 cores,","3.20 GHz","12MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.inteli78700));
		cpuList.add(new cpuclass("Intel", "i3-9100","4 cores,","3.60 GHz","6 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.inteli39100));
		cpuList.add(new cpuclass("Intel", "i5-9500","6 cores,","3.00 GHz","9 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.inteli59500));
		cpuList.add(new cpuclass("Intel", "i7-9700","8 cores,","3.00 GHz","12MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.inteli79700));
		cpuList.add(new cpuclass("Intel", "i3-10100","4 cores,","3.60 GHz","6 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.inteli310100));
		cpuList.add(new cpuclass("Intel", "i5-10500","6 cores,","3.10 GHz","12 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.inteli510500));
		cpuList.add(new cpuclass("Intel", "i7-10700","8 cores,","2.90 GHz","16 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.inteli710700));
		cpuList.add(new cpuclass("Ryzen", "7 1700","8 cores,","3.00 GHz ","16 MB L3 Cache","No Integrated Graphics","65 W",R.drawable.ryzen7));
		cpuList.add(new cpuclass("Ryzen", "9 5950X","16 Cores,","3.4 GHz","64 MB L3","No Integrated Graphics","105 W",R.drawable.ryzen95950));
		cpuList.add(new cpuclass("Ryzen", "7 5700G","8-Core,","3.8GHz","16MB L3","Radeon™ Graphics","45-65W",R.drawable.ryzen7));
		cpuList.add(new cpuclass("Ryzen", "5 5600G","6-Core,","3.90GHz","16MB L3","Radeon™ Graphics","65W",R.drawable.ryzen5));

		cpuAdapter = new CpuAdapter(this, 0, cpuList);
		ListView listView = (ListView) findViewById(R.id.names_list_view);
		listView.setAdapter(cpuAdapter);


	}
}