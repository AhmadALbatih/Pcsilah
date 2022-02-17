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
		ramList.add(new ramclass("Intel", "i3-8100","4 cores,","3.60 GHz","6 MB Intel® Smart Cache", R.drawable.cpu));
		ramList.add(new ramclass("Intel", "i3-8100","4 cores,","3.60 GHz","6 MB Intel® Smart Cache", R.drawable.cpu));
		ramList.add(new ramclass("Intel", "i3-8100","4 cores,","3.60 GHz","6 MB Intel® Smart Cache", R.drawable.cpu));
		ramList.add(new ramclass("Intel", "i3-8100","4 cores,","3.60 GHz","6 MB Intel® Smart Cache", R.drawable.cpu));
		ramList.add(new ramclass("Intel", "i3-8100","4 cores,","3.60 GHz","6 MB Intel® Smart Cache", R.drawable.cpu));
		ramAdapter = new RamAdapter(this, 0, ramList);
		ListView listView = (ListView) findViewById(R.id.names_list_view);
		listView.setAdapter(ramAdapter);


	}
}