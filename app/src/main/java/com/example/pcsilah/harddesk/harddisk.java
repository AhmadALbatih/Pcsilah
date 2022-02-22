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
		hdist.add(new harddiskclass("Intel", "i3-8100","4 cores,","3.60 GHz","6 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.cpu));
		hdist.add(new harddiskclass("Intel", "i3-8100","4 cores,","3.60 GHz","6 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.cpu));
		hdist.add(new harddiskclass("Intel", "i3-8100","4 cores,","3.60 GHz","6 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.cpu));
		hdist.add(new harddiskclass("Intel", "i3-8100","4 cores,","3.60 GHz","6 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.cpu));
		hdist.add(new harddiskclass("Intel", "i3-8100","4 cores,","3.60 GHz","6 MB Intel® Smart Cache","Intel® UHD Graphics 630","65 W",R.drawable.cpu));
		hdAdapter = new HarddiskAdapter(this, 0, hdist);
		ListView listView = (ListView) findViewById(R.id.names_list_view);
		listView.setAdapter(hdAdapter);


	}
}