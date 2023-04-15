package com.zybooks.trips;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {

    // Declare Variables
    Button firstButton, secondButton, thirdButton, fourthButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Initialize UI
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        //Get references of the buttons
        firstButton = findViewById(R.id.button1);
        secondButton = findViewById(R.id.button2);
        thirdButton = findViewById(R.id.button3);
        fourthButton = findViewById(R.id.button4);

        // Make title of the activity Dashboard
        setTitle("Dashboard");

        // For the back arrow
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // OnClickListeners for the buttons

        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Launch the FindTrips class
                Intent intent = new Intent(Dashboard.this, FindTrips.class);
                startActivity(intent);
            }
        });

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Launch the FindTrips class
                Intent intent = new Intent(Dashboard.this, Search.class);
                startActivity(intent);
            }
        });

        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Launch the FindTrips class
                Intent intent = new Intent(Dashboard.this, my_trips.class);
                startActivity(intent);
            }
        });

        // Set the setOnClickListener on findTrips Button
        fourthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Launch the FindTrips class
                Intent intent = new Intent(Dashboard.this, Settings.class);
                startActivity(intent);
            }
        });
    }

    // Overrides method, if the home button is clicked, the user is returned to original page
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}