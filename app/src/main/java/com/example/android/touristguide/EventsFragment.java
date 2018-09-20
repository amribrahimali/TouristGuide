package com.example.android.touristguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by El.masry on 04/02/2018.
 */

public class EventsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.list_item,container,false);

        final ArrayList<Place> places=new ArrayList<>();
        places.add(new Place(getString(R.string.date_30),0,getString(R.string.data_30_desc)));
        places.add(new Place(getString(R.string.data_642),0,getString(R.string.data_642_desc)));
        places.add(new Place(getString(R.string.data_2950),0,getString(R.string.data_2950_desc)));
        places.add(new Place(getString(R.string.data_669),0,getString(R.string.data_669_desc)));
        places.add(new Place(getString(R.string.data_1400),0,getString(R.string.data_1400_desc)));

        PlaceAdapter adapter=new PlaceAdapter(getActivity(),places );

        ListView listView=(ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

