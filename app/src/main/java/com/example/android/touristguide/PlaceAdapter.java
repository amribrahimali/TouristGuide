package com.example.android.touristguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by El.masry on 04/02/2018.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter( Context context, ArrayList<Place> arrayList) {
        super(context, 0, arrayList);
    }



    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        Place currentPlace = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_place, parent, false);
        }
        TextView Name = (TextView) convertView.findViewById(R.id.place_Name);
        TextView desc = (TextView) convertView.findViewById(R.id.place_desc);
        ImageView img = (ImageView) convertView.findViewById(R.id.place_img);

        Name.setText(currentPlace.getmName().toString());
        desc.setText(currentPlace.getmDesc().toString());
        if (currentPlace.getmImgId() != 0) {
            img.setImageResource(currentPlace.getmImgId());
        } else {
            img.setVisibility(View.GONE);
        }


        return convertView;
    }
}