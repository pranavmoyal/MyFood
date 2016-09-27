package com.example.niraj.myfoodapplication.RajasthaniFoodDetail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.niraj.myfoodapplication.R;

import java.util.List;


public class MainAdapter extends ArrayAdapter<RajasthaniItemDetailActivity>{
    public MainAdapter(Context context, List<RajasthaniItemDetailActivity> rajasthanidetail) {
        super(context, 0,rajasthanidetail);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_main, parent, false);

        ImageView imgdt = (ImageView) convertView.findViewById(R.id.img_detail);
        TextView tvitem = (TextView) convertView.findViewById(R.id.tv_itemname);


        imgdt.setImageResource(getItem(position).getImage());
        tvitem.setText(getItem(position).getName());



        return convertView;
    }
}
