package com.example.vidhya.tourguider;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class TrichyFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.Trichy_locations1,R.string.Trichy_desc1));
        locations.add(new Location(R.string.Trichy_locations2,R.string.Trichy_desc2));
        locations.add(new Location(R.string.Trichy_locations3,R.string.Trichy_desc3));
        locations.add(new Location(R.string.Trichy_locations4,R.string.Trichy_desc4));
        locations.add(new Location(R.string.Trichy_locations5,R.string.Trichy_desc5));
        locations.add(new Location(R.string.Trichy_locations6,R.string.Trichy_desc6));
        locations.add(new Location(R.string.Trichy_locations7,R.string.Trichy_desc7));

        LocationAdapter adapterOne= new LocationAdapter(getActivity(),locations, R.color.category_Trichy);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapterOne);

        return rootView;
    }
}
