package com.example.pcsilah.cpu;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pcsilah.R;

import java.util.List;

public class CpuAdapter extends ArrayAdapter<cpuclass>{
    private static final String TAG = CpuAdapter.class.getSimpleName();
    List<cpuclass> cpuList;

    public CpuAdapter(Context context, int resource, List<cpuclass> objects) {
        super(context, resource, objects);

        cpuList = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
            View listItemView = convertView;
        cpuclass currentcpu = cpuList.get(position);

            if(listItemView == null){
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.cpulist, parent, false);
            }

        TextView cmTextView = (TextView) listItemView.findViewById(R.id.cm);
        cmTextView.setText(currentcpu.getChipset_Manufacture());

        TextView cpuTextView = (TextView) listItemView.findViewById(R.id.cpu);
        cpuTextView.setText(currentcpu.getCPU());

        TextView coresTextView = (TextView) listItemView.findViewById(R.id.Cores);
        coresTextView.setText(currentcpu.getCores());

        TextView Clock_speedTextView = (TextView) listItemView.findViewById(R.id.Clock_speed);
        Clock_speedTextView.setText(currentcpu.getClock_speed());

        TextView Processor_GraphicsTextView = (TextView) listItemView.findViewById(R.id.Processor_Graphics);
        Processor_GraphicsTextView.setText(currentcpu.getProcessor_Graphics());

        TextView TDPTextView = (TextView) listItemView.findViewById(R.id.TDP);
        TDPTextView.setText(currentcpu.getTDP());

        ImageView numbersImage = listItemView.findViewById(R.id.imageView);
        assert listItemView != null;
        numbersImage.setImageResource(currentcpu.getImage());



            return listItemView;
        }
    }
