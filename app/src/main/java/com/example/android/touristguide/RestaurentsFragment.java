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

public class RestaurentsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.list_item,container,false);

        final ArrayList<Place> places=new ArrayList<>();

        places.add(new Place(getString(R.string.esplanade),R.drawable.esplanade,getString(R.string.esplanade_desc)));
        places.add(new Place(getString(R.string.birdcage),R.drawable.birdcage,getString(R.string.birdcage_desc)));
        places.add(new Place(getString(R.string.kadoura),R.drawable.kadoura,getString(R.string.kadoura_desc)));
        places.add(new Place(getString(R.string.cook_door),R.drawable.cook_door,getString(R.string.cook_door_desc)));


        PlaceAdapter adapter=new PlaceAdapter(getActivity(),places );
        ListView listView=(ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}

