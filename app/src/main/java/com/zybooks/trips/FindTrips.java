package com.zybooks.trips;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class FindTrips extends AppCompatActivity {

    // Declare Variables
    Button request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Initialize UI
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_trips);

        // Create RecyclerView object and reference the xml file
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        // Add items to the recyclerview
        List<Trip> items = new ArrayList<Trip>();
        items.add(new Trip("Universal", "Marcia", "2/4 seats filled", "9:00 AM", "2.5 hours"));
        items.add(new Trip("Trader Joe's", "Joe", "3/4 seats filled", "11:00 AM", ".5 hours"));
        items.add(new Trip("Daytona Beach", "Broseph", "1/4 seats filled", "12:00 PM", "4.5 hours"));
        items.add(new Trip("Einstein's Bagel", "Bonnie", "2/4 seats filled", "1:00 PM", ".5 hours"));
        items.add(new Trip("Orange Grove", "Orangey", "2/4 seats filled", "1:00 PM", "2.5 hours"));
        items.add(new Trip("Publix", "Kenzie", "2/4 seats filled", "1:30 PM", "1 hours"));
        items.add(new Trip("Downtown", "Charlie", "2/4 seats filled", "2:00 PM", "2.5 hours"));
        items.add(new Trip("Kelly's Ice Cream", "Marcia", "2/4 seats filled", "3:00 PM", "1 hours"));
        items.add(new Trip("Banjo Deluxe", "Billy", "2/4 seats filled", "5:00PM", "1.5 hours"));
        recyclerView.setLayoutManager(new LinearLayoutManager(FindTrips.this));
        recyclerView.setAdapter(new TripAdapter(getApplicationContext(), items));

        // Set the title of the activity to "Find Trips"
        setTitle("Find Trips");
        // For the back arrow
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    // Overrides method, if the home button is clicked, the user is returned to the original page
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
