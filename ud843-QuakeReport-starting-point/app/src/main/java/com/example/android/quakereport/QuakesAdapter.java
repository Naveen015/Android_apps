package com.example.android.quakereport;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class QuakesAdapter extends ArrayAdapter<Quakes> {
    public QuakesAdapter(Activity context, ArrayList<Quakes> quakes){
        super(context,0,quakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView== null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.listview,parent,false);
        }

        Quakes currentQuakes = getItem(position);


        Double magObject = currentQuakes.getmMagnitude();
        DecimalFormat formatMagnitude = new DecimalFormat("0.0");
        String mag = formatMagnitude.format(magObject);
        TextView magnitude = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitude.setText(mag);
        GradientDrawable magnitudeCircle = (GradientDrawable) magnitude.getBackground();
        int magnitudeColor = getMagnitudeColor(currentQuakes.getmMagnitude());
        magnitudeCircle.setColor(magnitudeColor);

        String location  = currentQuakes.getmLocation();
        String locationOffset;
        String primaryLocation;
        if(location.contains("of")){
        String[] parts = location.split("(?<=of)");
        locationOffset = parts[0];
        primaryLocation = parts[1];
        }
        else{
            locationOffset = "Near the";
            primaryLocation = location;
        }
        TextView offset = (TextView) listItemView.findViewById(R.id.location_offset);
        offset.setText(locationOffset);
        TextView place = (TextView) listItemView.findViewById(R.id.primary_location);
        place.setText(primaryLocation);

        Date dateObject = new Date(currentQuakes.getmMilliseconds());
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        String formattedDate = formatDate(dateObject);
        dateView.setText(formattedDate);
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        String formattedTime = formatTime(dateObject);
        timeView.setText(formattedTime);

        return listItemView;
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

    private int getMagnitudeColor(double magnitude) {
        int magnitudeColorResourceId;
        int magnitudeFloor = (int) Math.floor(magnitude);
        switch (magnitudeFloor) {
            case 0:
            case 1:
                magnitudeColorResourceId = R.color.magnitude1;
                break;
            case 2:
                magnitudeColorResourceId = R.color.magnitude2;
                break;
            case 3:
                magnitudeColorResourceId = R.color.magnitude3;
                break;
            case 4:
                magnitudeColorResourceId = R.color.magnitude4;
                break;
            case 5:
                magnitudeColorResourceId = R.color.magnitude5;
                break;
            case 6:
                magnitudeColorResourceId = R.color.magnitude6;
                break;
            case 7:
                magnitudeColorResourceId = R.color.magnitude7;
                break;
            case 8:
                magnitudeColorResourceId = R.color.magnitude8;
                break;
            case 9:
                magnitudeColorResourceId = R.color.magnitude9;
                break;
            default:
                magnitudeColorResourceId = R.color.magnitude10plus;
                break;
        }
        return ContextCompat.getColor(getContext(), magnitudeColorResourceId);
    }
}
