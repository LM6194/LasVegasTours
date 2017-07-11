package com.example.luis.lasvegastours;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Hotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);

        //Create a list of Hotels
        final ArrayList<TourActivity> words = new ArrayList<TourActivity>();
        // listOfRestaurants add
        words.add(new TourActivity("Bellagio","website","address", R.drawable.bellagio));
        words.add(new TourActivity("Luxor","website","address", R.drawable.luxor_hotel));
        words.add(new TourActivity("Treasure Island","website","address", R.drawable.treasure_island));
        words.add(new TourActivity("Wynn","website","address", R.drawable.wynn_hotel));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource define in the Android framework.
        // This list item layout contains a single {@link TextView}, which the
        // adapter will set to display a single word.
        TourActivityAdapter adapter = new TourActivityAdapter (this, words);

        // Find the {@link listView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in
        // tour_list file.

        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word id the list of restaurants
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.

        listView.setAdapter(adapter);


    }
}
