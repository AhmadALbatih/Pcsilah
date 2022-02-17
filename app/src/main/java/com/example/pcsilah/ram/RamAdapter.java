package com.example.pcsilah.ram;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pcsilah.R;

import java.util.List;

public class RamAdapter extends ArrayAdapter<ramclass>{
    private static final String TAG = RamAdapter.class.getSimpleName();
    List<ramclass> ramList;

    public RamAdapter(Context context, int resource, List<ramclass> objects) {
        super(context, resource, objects);

        ramList = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
            View listItemView = convertView;
        ramclass currentcpu = ramList.get(position);

            if(listItemView == null){
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.ramlist, parent, false);
            }

        TextView cmTextView = (TextView) listItemView.findViewById(R.id.Ram_memory_technology);
        cmTextView.setText(currentcpu.getRam_memory_technology());

        TextView cpuTextView = (TextView) listItemView.findViewById(R.id.Voltage);
        cpuTextView.setText(currentcpu.getVoltage());

        TextView coresTextView = (TextView) listItemView.findViewById(R.id.brand_name);
        coresTextView.setText(currentcpu.getBrand_name());

        TextView Clock_speedTextView = (TextView) listItemView.findViewById(R.id.Capacity);
        Clock_speedTextView.setText(currentcpu.getCapacity());
        TextView Memory_SpeedTextView = (TextView) listItemView.findViewById(R.id.Memory_Speed);
        Memory_SpeedTextView.setText(currentcpu.getMemory_Speed());


        ImageView numbersImage = listItemView.findViewById(R.id.imageView);
        assert listItemView != null;
        numbersImage.setImageResource(currentcpu.getImage());



            return listItemView;
        }
    }
