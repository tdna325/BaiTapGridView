package com.example.gridview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends ArrayAdapter<InforList> {
    private Context context;
    private int resource;
    private ArrayList<InforList> arrInfor;
    public Adapter(@NonNull Context context, int resource, @NonNull ArrayList<InforList> objects) {
        super(context, resource, objects);
        this.arrInfor = objects;
        this.context =context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.gridlayout,parent,false);
        ImageView imageView = convertView.findViewById(R.id.imageGrid);
        TextView gv_name = convertView.findViewById(R.id.name);
        TextView gv_addr = convertView.findViewById(R.id.addr);
        TextView gv_num = convertView.findViewById(R.id.number);

        InforList inforList = arrInfor.get(position);

        imageView.setImageResource(inforList.getgImage());
        gv_name.setText(inforList.getgName());
        gv_addr.setText(inforList.getgAdd());
        gv_num.setText(inforList.getgNum());

        return convertView;
    }

}
