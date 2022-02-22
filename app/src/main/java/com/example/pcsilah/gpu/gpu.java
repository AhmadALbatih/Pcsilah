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
		gpuList.add(new gpuclass("Intel", "i3-8100", "h", "4 cores,","3.60 GHz","6 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.cpu));
		gpuList.add(new gpuclass("Intel", "i3-8100", "h", "4 cores,","3.60 GHz","6 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.cpu));
		gpuList.add(new gpuclass("Intel", "i3-8100", "h", "4 cores,","3.60 GHz","6 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.cpu));
		gpuList.add(new gpuclass("Intel", "i3-8100", "h", "4 cores,","3.60 GHz","6 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.cpu));
		gpuList.add(new gpuclass("Intel", "i3-8100", "h", "4 cores,","3.60 GHz","6 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.cpu));
		gpuAdapter = new GpuAdapter(this, 0, gpuList);
		ListView listView = (ListView) findViewById(R.id.names_list_view);
		listView.setAdapter(gpuAdapter);


	}
}