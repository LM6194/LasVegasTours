package com.example.luis.lasvegastours;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.manageSpaceActivity;
import static android.R.attr.start;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view that show the hotel category
        final TextView hotel = (TextView) findViewById(R.id.list_hotels);

        // set a click listener on the hotels view
        hotel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // Create a new intent to open the {@ Link Hotels}
                Intent hotelIntent = new Intent(MainActivity.this, Hotels.class);
                // start new class Hotels
                startActivity(hotelIntent);
            }
        });


        //Find the view that show the restaurant category
        final TextView restaurant = (TextView) findViewById(R.id.list_restaurants);

        // Set a click listener on the restaurant view
        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@ Link Restaurant}
                Intent restaurantIntent = new Intent(MainActivity.this, Restaurants.class);
                // start new class Restaurant
                startActivity(restaurantIntent);
            }
        });


        // Find the view that show the show category
        final TextView show = (TextView) findViewById(R.id.list_shows);

        // set a click listener on the shows view
        show.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // Create a new intent to open the {@ Link Show}
                Intent showIntent = new Intent(MainActivity.this, Shows.class);
                // start new class Shows
                startActivity(showIntent);
            }
        });

        // Find the view that show the thing to do category
        final TextView thingToDo = (TextView) findViewById(R.id.list_things_to_do);

        // set a click listener on the thing to do view
        thingToDo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // Create a new intent to open the {@ Link Thing to do}
                Intent thingToDoIntent = new Intent(MainActivity.this, ThingsToDo.class);
                // start new class Shows
                startActivity(thingToDoIntent);
            }
        });
    }

}
