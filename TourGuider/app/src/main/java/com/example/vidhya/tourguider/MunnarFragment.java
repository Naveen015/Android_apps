package com.example.vidhya.tourguider;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MunnarFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.Munnar_location1,R.string.Munnar_desc1,R.drawable.mattupetty));
        locations.add(new Location(R.string.Munnar_location2,R.string.Munnar_desc2,R.drawable.devikulam));
        locations.add(new Location(R.string.Munnar_location3,R.string.Munnar_desc3,R.drawable.pallivasal));
        locations.add(new Location(R.string.Munnar_location4,R.string.Munnar_desc4,R.drawable.vattavada));
        locations.add(new Location(R.string.Munnar_location5,R.string.Munnar_desc5,R.drawable.attukal));
        locations.add(new Location(R.string.Munnar_location6,R.string.Munnar_desc6,R.drawable.nyayamakad));
        locations.add(new Location(R.string.Munnar_location7,R.string.Munnar_desc7,R.drawable.meesapulimala));

        LocationAdapter adapterOne= new LocationAdapter(getActivity(),locations, R.color.category_Munnar);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapterOne);

        return rootView;
    }
}
