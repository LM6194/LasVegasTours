package com.example.luis.lasvegastours;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Shows extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);

        //Create a list of Shows
        final ArrayList<TourActivity> words = new ArrayList<TourActivity>();
        // listOfRestaurants add
        words.add(new TourActivity("Blue Man Group","www.luxor.com",
                "3900 S Las Vegas Blvd"+"\n"+"Las Vegas, NV 89119"+"\n"+"702.262.4000",
                R.drawable.blue_man_group));
        words.add(new TourActivity("KA","www.cirquedusoleil.com/ka","3799 S Las Vegas Blvd"+"\n"+
                "Las Vegas, NV 89109"+"\n"+"877-880-0880", R.drawable.ka_1));
        words.add(new TourActivity("Mystere","www.treasureisland.com","3300 LAS VEGAS BLVD"+"\n"+
                "LAS VEGAS, NV 89109"+"\n"+"1-800-944-7444", R.drawable.cirque_du_soleil_mystere));
        words.add(new TourActivity("O","www.cirquedusoleil.com/o","3600 S Las Vegas Blvd"+"\n" +
                "Las Vegas, NV 89109"+"\n"+"702.693.7111", R.drawable.cirque_du_soleil_o));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource define in the Android framework.
        // This list item layout contains a single {@link TextView}, which the
        // adapter will set to display a single word.
        TourActivityAdapter adapter = new TourActivityAdapter (this, words, R.color.category_shows);

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
