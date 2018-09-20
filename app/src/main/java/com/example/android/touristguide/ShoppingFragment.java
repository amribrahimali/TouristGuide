package com.example.android.touristguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Created by El.masry on 04/02/2018.
 */

public class ShoppingFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.list_item,container,false);


        final ArrayList<Place> places=new ArrayList<>();

        places.add(new Place(getString(R.string.cairo_festival),R.drawable.cairo_festival,getString(R.string.cairo_festival_desc)));
        places.add(new Place(getString(R.string.downtown),R.drawable.downtown,getString(R.string.downtown_desc)));
        places.add(new Place(getString(R.string.mall_of_arabic),R.drawable.mall_arabic,getString(R.string.mall_arabic_desc)));
        places.add(new Place(getString(R.string.carrefour),R.drawable.carrefour,getString(R.string.carrefour_desc)));

        PlaceAdapter adapter=new PlaceAdapter(getActivity(),places );

        ListView listView=(ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

