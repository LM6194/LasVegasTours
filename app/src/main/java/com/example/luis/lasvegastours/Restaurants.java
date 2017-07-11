package com.example.luis.lasvegastours;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);
        //Create a list of restaurants
        final ArrayList<TourActivity> words = new ArrayList<TourActivity>();
        // listOfRestaurants add
        words.add(new TourActivity("Mon Ami Gabi","website","address", R.drawable.mon_ami_gabi));
        words.add(new TourActivity("Raku","website","address", R.drawable.raku));
        words.add(new TourActivity("Sinatra","website","address", R.drawable.sinatra));
        words.add(new TourActivity("Texas de Brazil","website","address", R.drawable.texas_de_brazil));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource define in the Android framework.
        // This list item layout contains a single {@link TextView}, which the
        // adapter will set to display a single word.
        TourActivityAdapter adapter = new TourActivityAdapter (this, words);

        // Find the {@link listView} object in the view hierarchy of the {@link Activeity}.
        // There should be a {@link LlistView} with the view ID called list, which is declared in
        // tour_list.xmle.

        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display llist items for each word id the list of restaurants
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.

        listView.setAdapter(adapter);
    }
}
