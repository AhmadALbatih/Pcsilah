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
		cpuList.add(new cpuclass("Intel", "i3-8100","4 cores,","3.60 GHz","6 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.cpu));
		cpuList.add(new cpuclass("Intel",
				"i3-8100","4 cores,","3.60 GHz","6 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.cpu));
		cpuList.add(new cpuclass("Intel", "i3-8100","4 cores,","3.60 GHz","6 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.cpu));
		cpuList.add(new cpuclass("Intel", "i3-8100","4 cores,","3.60 GHz","6 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.cpu));
		cpuList.add(new cpuclass("Intel", "i3-8100","4 cores,","3.60 GHz","6 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.cpu));
		cpuList.add(new cpuclass("Intel", "i3-8100","4 cores,","3.60 GHz","6 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.cpu));
		cpuAdapter = new CpuAdapter(this, 0, cpuList);
		ListView listView = (ListView) findViewById(R.id.names_list_view);
		listView.setAdapter(cpuAdapter);


	}
}