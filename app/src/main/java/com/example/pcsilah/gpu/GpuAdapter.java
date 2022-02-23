package com.example.pcsilah.gpu;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pcsilah.R;

import java.util.List;

public class GpuAdapter extends ArrayAdapter<gpuclass>{
    private static final String TAG = GpuAdapter.class.getSimpleName();
    List<gpuclass> gpuList;

    public GpuAdapter(Context context, int resource, List<gpuclass> objects) {
        super(context, resource, objects);

        gpuList = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
            View listItemView = convertView;
        gpuclass currentcpu = gpuList.get(position);

            if(listItemView == null){
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.gpulist, parent, false);
            }

        TextView cmTextView = (TextView) listItemView.findViewById(R.id.Chipset_Manufacture);
        cmTextView.setText(currentcpu.getChipset_Manufacture());

        TextView cpuTextView = (TextView) listItemView.findViewById(R.id.GPU);
        cpuTextView.setText(currentcpu.getGPU());

        TextView BrandTextView = (TextView) listItemView.findViewById(R.id.Brand);
        BrandTextView.setText(currentcpu.getBrand());

        TextView coresTextView = (TextView) listItemView.findViewById(R.id.Memory);
        coresTextView.setText(currentcpu.getMemory());

        TextView Clock_speedTextView = (TextView) listItemView.findViewById(R.id.Memory_Type);
        Clock_speedTextView.setText(currentcpu.getMemory_Type());

        TextView Processor_GraphicsTextView = (TextView) listItemView.findViewById(R.id.GPU_clock);
        Processor_GraphicsTextView.setText(currentcpu.getGPU_clock());

        TextView Memory_clockTextView = (TextView) listItemView.findViewById(R.id.Memory_clock);
        Memory_clockTextView.setText(currentcpu.getMemory_clock());

        TextView TDPTextView = (TextView) listItemView.findViewById(R.id.Memory_bandwidth);
        TDPTextView.setText(currentcpu.getMemory_bandwidth());

        ImageView numbersImage = listItemView.findViewById(R.id.imageView);
        assert listItemView != null;
        numbersImage.setImageResource(currentcpu.getImage());



            return listItemView;
        }
    }
