package com.example.vidhya.tourguider;

import android.widget.ArrayAdapter;
import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {
    private int mColorResourceId;

    public LocationAdapter(Activity context, ArrayList<Location> locations, int colorResourceId) {
        super(context, 0, locations);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.Location_name);
        nameTextView.setText(currentLocation.getLocationName());
        TextView addTextView = (TextView) listItemView.findViewById(R.id.Location_add);
        addTextView.setText(currentLocation.getLocationDesc());

        if(currentLocation.getLocationImg()!=0)
        { ImageView addImageView = (ImageView) listItemView.findViewById(R.id.image);
        addImageView.setImageResource(currentLocation.getLocationImg());}


        View textContainer = listItemView.findViewById(R.id.Location_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
