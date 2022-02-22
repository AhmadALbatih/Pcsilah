package com.example.pcsilah.harddesk;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pcsilah.R;

import java.util.ArrayList;
import java.util.List;

public class harddisk extends AppCompatActivity {
	private List<harddiskclass> hdist;
	private HarddiskAdapter hdAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hd);
		hdist = new ArrayList<>();
		hdist.add(new harddiskclass("HDD", "WD Blue","142.8 MB/s and 159.8 MB/s ", "7200 RPM","1TB","SATA ",R.drawable.cpu));
		hdist.add(new harddiskclass("HDD", "WD Black","188 MB/s and 182 MB/s ", "7200 RPM","1TB","SATA ",R.drawable.cpu));
		hdist.add(new harddiskclass("HDD", "WD Green","111 MB/s and 109 MB/s ", "7200 RPM","1TB","SATA ",R.drawable.cpu));
		hdist.add(new harddiskclass("SSD", "SAMSUNG 870 QVO","560  MB/s and 530 MB/s", "N/A","1TB - 8TB","SATA ",R.drawable.cpu));
		hdist.add(new harddiskclass("SSD", "WD Blue","545 MB", "N/A","1TB","SATA ",R.drawable.cpu));
		hdist.add(new harddiskclass("SSD", "WD Green","545 MB ", "N/A","480 GB - 1TB","SATA ",R.drawable.cpu));
		hdist.add(new harddiskclass("M.2 SSD", "TEAMGROUP MP33"," 1,700/1,400 MB/s", "N/A","256GB - 8TB","NVMe ",R.drawable.cpu));
		hdist.add(new harddiskclass("M.2 SSD", "SAMSUNG 970 EVO PLUS","3500 MB ", "N/A","500GB - 1TB","NVMe ",R.drawable.cpu));
		hdist.add(new harddiskclass("M.2 SSD", "WD_BLACK SN850","7000 MB ", "N/A","500GB - 1TB","NVMe ",R.drawable.cpu));
		hdAdapter = new HarddiskAdapter(this, 0, hdist);
		ListView listView = (ListView) findViewById(R.id.names_list_view);
		listView.setAdapter(hdAdapter);


	}
}