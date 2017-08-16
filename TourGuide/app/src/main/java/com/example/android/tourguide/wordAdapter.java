package com.example.android.tourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Gurjeet on 30-Jan-17.
 */

public class wordAdapter extends ArrayAdapter<Word> {

    private int mColor;
    public wordAdapter(Activity context, ArrayList<Word> w, int color){
        super(context,0,w);
        mColor=color;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing v iew is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        View textBgcolor=listItemView.findViewById(R.id.layoutfull);
        int color= ContextCompat.getColor(getContext(),mColor);
        textBgcolor.setBackgroundColor(color);

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the miwok translation
        TextView title = (TextView) listItemView.findViewById(R.id.title);
        // Get the miwok translation from the current Word object and
        // set this text on the name TextView
        title.setText(currentWord.getTitle());

        // Find the TextView in the list_item.xml layout with the eng translation
        TextView loc = (TextView) listItemView.findViewById(R.id.location);
        // Get the eng translation from the current Word object and
        // set this text on the number TextView
        loc.setText(currentWord.getLoc());

        ImageView imageView=(ImageView)listItemView.findViewById(R.id.img);
        imageView.setImageResource(currentWord.getImage());



        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }

}