package com.example.pcsilah.harddesk;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pcsilah.R;

import java.util.List;

public class HarddiskAdapter extends ArrayAdapter<harddiskclass>{
    private static final String TAG = HarddiskAdapter.class.getSimpleName();
    List<harddiskclass> hdList;

    public HarddiskAdapter(Context context, int resource, List<harddiskclass> objects) {
        super(context, resource, objects);

        hdList = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
            View listItemView = convertView;
        harddiskclass currentcpu = hdList.get(position);

            if(listItemView == null){
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.hdlist, parent, false);
            }

        TextView cmTextView = (TextView) listItemView.findViewById(R.id.Storge_type);
        cmTextView.setText(currentcpu.getStorge_type());

        TextView cpuTextView = (TextView) listItemView.findViewById(R.id.brand_name);
        cpuTextView.setText(currentcpu.getBrand_name());

        TextView coresTextView = (TextView) listItemView.findViewById(R.id.SRW);
        coresTextView.setText(currentcpu.getSRW());

        TextView Clock_speedTextView = (TextView) listItemView.findViewById(R.id.Memory_Speed);
        Clock_speedTextView.setText(currentcpu.getMemory_Speed());

        TextView TDPTextView = (TextView) listItemView.findViewById(R.id.Type_port);
        TDPTextView.setText(currentcpu.getType_port());

        ImageView numbersImage = listItemView.findViewById(R.id.imageView);
        assert listItemView != null;
        numbersImage.setImageResource(currentcpu.getImage());



            return listItemView;
        }
    }
