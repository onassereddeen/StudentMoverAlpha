package com.zybooks.trips;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class TripAdapter extends RecyclerView.Adapter<TripHolder> {
    // Declare Variables
    Context context;
    List<Trip>items;

    // Constructor provides access to current instance of Adapter class variables
    public TripAdapter(Context context, List<Trip> items) {
        this.context = context;
        this.items = items;
    }

    // Create ViewHolder
    @NonNull
    @Override
    public TripHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TripHolder(LayoutInflater.from(context).inflate(R.layout.list_item_trips, parent, false));
    }

    // Display data in view, using holder object
    @Override
    public void onBindViewHolder(@NonNull TripHolder holder, int position) {
        holder.startTime.setText(items.get(position).getmStartingTime());
        holder.durationTime.setText(items.get(position).getmDuration());
        holder.tripName.setText(items.get(position).getmTripName());
        holder.drivenBy.setText(items.get(position).getmDriver());
        holder.seatsFilled.setText(items.get(position).getSeats());
    }

    // helper method
    @Override
    public int getItemCount() {
        return items.size();
    }
}
