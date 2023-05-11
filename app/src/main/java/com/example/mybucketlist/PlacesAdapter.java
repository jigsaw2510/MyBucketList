package com.example.mybucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.PlaceViewHolder> {

    private Place[] places;

    public PlacesAdapter(Place[] places) {
        this.places = places;
    }

    @Override
    public int getItemCount() {
        return places.length;
    }

    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_places_to_go, parent, false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        holder.bind(places[position]);
    }



    static class PlaceViewHolder extends RecyclerView.ViewHolder {

        ImageView appImage;
        TextView appTitle;
        TextView appDescription;

        public PlaceViewHolder(@NonNull View itemView) {
            super(itemView);

            appImage = itemView.findViewById(R.id.image_view_place_icon);
            appTitle = itemView.findViewById(R.id.text_view_place_name);
            appDescription = itemView.findViewById(R.id.text_view_place_description);
        }

        public void bind(Place place) {
            appTitle.setText(place.name);
            appDescription.setText(place.description);
            appImage.setImageResource(place.image);
        }
    }
}
