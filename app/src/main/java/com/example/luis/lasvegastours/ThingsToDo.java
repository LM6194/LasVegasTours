package com.example.luis.lasvegastours;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ThingsToDo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);

        //Create a list of restaurants
        final ArrayList<TourActivity> words = new ArrayList<TourActivity>();
        // listOfRestaurants add
        words.add(new TourActivity("Sky Walk Grand Canyon","www.grandcanyonwest.com/skywalk--eagle-point.htm",
                "Address: Check Website", R.drawable.sky_walk));
        words.add(new TourActivity("High Rollers","www.caesars.com/linq","3535 Las Vegas Blvd South\n" +
                "Las Vegas, NV 89109\n" +"1-800-634-6441", R.drawable.high_rollers));
        words.add(new TourActivity("Hoover Dam","www.vegas.com/attractions/near-las-vegas/hoover-dam/",
                "The Dam is 35 miles south of Las Vegas on U.S. 93.", R.drawable.hoover_dam));
        words.add(new TourActivity("Red Rock Canyon","www.redrockcanyonlv.org","1000 Scenic Loop Drive\n" +
                "Las Vegas, NV 89161\n"+"(702) 515-5367", R.drawable.red_rock_canyon));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource define in the Android framework.
        // This list item layout contains a single {@link TextView}, which the
        // adapter will set to display a single word.
        TourActivityAdapter adapter = new TourActivityAdapter (this, words, R.color.category_things_to_do);

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
