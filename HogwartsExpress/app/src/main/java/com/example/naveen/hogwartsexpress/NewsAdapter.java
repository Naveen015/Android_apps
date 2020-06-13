package com.example.naveen.hogwartsexpress;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Activity context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView== null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view,parent,false);
        }

        News currentNews = getItem(position);

        String section = currentNews.getmSection();
        TextView Section = (TextView) listItemView.findViewById(R.id.section);
        Section.setText(section);

        String title  = currentNews.getmTitle();
        TextView Title = (TextView) listItemView.findViewById(R.id.Title);
        Title.setText(title);

        String author = currentNews.getmAuthor();
        TextView Author = (TextView) listItemView.findViewById(R.id.author);
        Author.setText(author);

        String date_time  = currentNews.getmDate();
        String date;
        String time;
        String[] parts = date_time.split("T");
        date = parts[0];
        String[] parts1 = parts[1].split("Z");
        time = parts1[0];
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(date);
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        timeView.setText(time);

        return listItemView;
    }

}
