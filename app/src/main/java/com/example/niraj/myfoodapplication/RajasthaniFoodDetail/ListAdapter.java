package com.example.niraj.myfoodapplication.RajasthaniFoodDetail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.niraj.myfoodapplication.R;

import java.util.List;

public class ListAdapter extends ArrayAdapter<FoodDetailActivity> {
    public ListAdapter(Context context, List<FoodDetailActivity> food) {
        super(context,0,food);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_food, parent, false);


        TextView vegitable = (TextView) convertView.findViewById(R.id.tv_itemvegitable);
        vegitable.setText(getItem(position).getName());

        return convertView;
    }
}
