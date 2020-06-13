package com.example.vidhya.tourguider;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MysuruFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.Mysuru_location1,R.string.Mysuru_desc1));
        locations.add(new Location(R.string.Mysuru_location2,R.string.Mysuru_desc2));
        locations.add(new Location(R.string.Mysuru_location3,R.string.Mysuru_desc3));
        locations.add(new Location(R.string.Mysuru_location4,R.string.Mysuru_desc4));
        locations.add(new Location(R.string.Mysuru_location5,R.string.Mysuru_desc5));
        locations.add(new Location(R.string.Mysuru_location6,R.string.Mysuru_desc6));
        locations.add(new Location(R.string.Mysuru_location7,R.string.Mysuru_desc7));
        locations.add(new Location(R.string.Mysuru_location8,R.string.Mysuru_desc8));

        LocationAdapter adapterOne= new LocationAdapter(getActivity(),locations, R.color.category_Mysuru);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapterOne);

        return rootView;
    }
}
