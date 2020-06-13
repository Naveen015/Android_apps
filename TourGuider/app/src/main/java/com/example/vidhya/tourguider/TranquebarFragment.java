package com.example.vidhya.tourguider;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class TranquebarFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.Tranquebar_location1,R.string.Tranquebar_desc1));
        locations.add(new Location(R.string.Tranquebar_location2,R.string.Tranquebar_desc2));
        locations.add(new Location(R.string.Tranquebar_location3,R.string.Tranquebar_desc3));
        locations.add(new Location(R.string.Tranquebar_location4,R.string.Tranquebar_desc4));
        locations.add(new Location(R.string.Tranquebar_location5,R.string.Tranquebar_desc5));
        locations.add(new Location(R.string.Tranquebar_location6,R.string.Tranquebar_desc6));
        locations.add(new Location(R.string.Tranquebar_location7,R.string.Tranquebar_desc7));

        LocationAdapter adapterOne= new LocationAdapter(getActivity(),locations, R.color.category_Tranquebar);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapterOne);

        return rootView;
    }
}
