package com.example.niraj.myfoodapplication.RajasthaniFood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.niraj.myfoodapplication.R;

import java.util.List;


public class RestaurtentAdapter extends ArrayAdapter<RestaurtentActivity> {


    public RestaurtentAdapter(Context context, List<RestaurtentActivity> reasturtant) {
        super(context, 0,reasturtant);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_about_rest, parent, false);

        ImageView imgfd = (ImageView) convertView.findViewById(R.id.imgFood);
        TextView tvraj = (TextView) convertView.findViewById(R.id.tvrajasthan);

        imgfd.setImageResource(getItem(position).getImage());
        tvraj.setText(getItem(position).getName());



        return convertView;
    }


}
