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

public class PlacesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.list_item,container,false);

        final ArrayList<Place> places=new ArrayList<>();
        places.add(new Place(getString(R.string.citadel_qaitbay),R.drawable.citadel,getString(R.string.citadel_qaitbay_desc)));
        places.add(new Place(getString(R.string.montaza_palace),R.drawable.montaza,getString(R.string.montaza_palace_desc)));
        places.add(new Place(getString(R.string.blue_hole),R.drawable.blue_hole,getString(R.string.blue_hole_desc)));
        places.add(new Place(getString(R.string.karnak_temple),R.drawable.karnak,getString(R.string.karnak_temple_desc)));

        PlaceAdapter adapter=new PlaceAdapter(getActivity(),places );

        ListView listView=(ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

