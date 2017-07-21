package com.example.luis.lasvegastours;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.media.CamcorderProfile.get;

public class Hotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);

        //Create a list of Hotels
        final ArrayList<TourActivity> words = new ArrayList<TourActivity>();
        // listOfRestaurants add
        words.add(new TourActivity("Bellagio","www.bellagio.com","3600 S Las Vegas Blvd"+"\n"+
                "Las Vegas, NV 89109"+"\n"+"702.693.7111", R.drawable.bellagio));
        words.add(new TourActivity("Luxor","www.luxor.com","3900 S Las Vegas Blvd"+"\n"+
                "Las Vegas, NV 89119"+"\n"+"702.262.4000", R.drawable.luxor_hotel));
        words.add(new TourActivity("Treasure Island","www.treasureisland.com","3300 LAS VEGAS BLVD"+"\n"+
                "LAS VEGAS, NV 89109"+"\n"+"1-800-944-7444", R.drawable.treasure_island));
        words.add(new TourActivity("Wynn","www.wynnlasvegas.com","3131 Las Vegas Blvd."+"\n" +
                "Las Vegas, NV 89109"+"\n"+"(702) 770-7000", R.drawable.wynn_hotel));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource define in the Android framework.
        // This list item layout contains a single {@link TextView}, which the
        // adapter will set to display a single word.
        TourActivityAdapter adapter = new TourActivityAdapter (this, words, R.color.category_hotels);

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
