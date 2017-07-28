package com.example.luis.lasvegastours;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.start;

/**
 * Created by Luis on 6/29/2017.
 */

public class TourActivityAdapter extends ArrayAdapter<TourActivity> {

    private static final String LOG_TAG = TourActivityAdapter.class.getSimpleName();
    /** Resource ID for the background color for this list of words*/
    private int mColorResourceId;

    public TourActivityAdapter(Activity context, ArrayList<TourActivity> words, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        final TourActivity currentTourActivity = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID place name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.place_name);

        // set this text on the name TextView
        nameTextView.setText(currentTourActivity.getName());

        // Find the TextView in the list_item.xml layout with the ID web site
        TextView webTextView = (TextView) listItemView.findViewById(R.id.web_site);

        // set this text on the website TextView
        webTextView.setText(currentTourActivity.getWebsite());

        // Find the TextView in the list_item.xml layout with the ID location
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location);

        // set this text on the address TextView
        locationTextView.setText(currentTourActivity.getAddress());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        // set this image on the image ImageView
        imageView.setImageResource(currentTourActivity.getImageResourseId());

        //set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //find the color that the resource ID maps
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        //set the background color of the text container View
        textContainer.setBackgroundColor(color);


        // Return the whole list item layout (containing 3 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
