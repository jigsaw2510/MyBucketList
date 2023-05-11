package com.example.mybucketlist;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class ThingsAdapter extends RecyclerView.Adapter<ThingsAdapter.ThingViewHolder> {

    private Thing[] things;

    public ThingsAdapter(Thing[] things) {
        this.things = things;
    }

    @Override
    public int getItemCount() {
        return things.length;
    }

    @NonNull
    @Override
    public ThingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_things_to_do, parent, false);
        return new ThingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ThingViewHolder holder, int position) {
        holder.bind(things[position]);
    }



    static class ThingViewHolder extends RecyclerView.ViewHolder {

        ImageView appImage;
        TextView appTitle;
        TextView appDescription;
        public ThingViewHolder(@NonNull View itemView) {
            super(itemView);

            appImage = itemView.findViewById(R.id.image_view_thing_icon);
            appTitle = itemView.findViewById(R.id.text_view_thing_name);
            appDescription = itemView.findViewById(R.id.text_view_thing_description);
        }

        public void bind(Thing thing) {
            appTitle.setText(thing.name);
            appDescription.setText(thing.description);
            appImage.setImageResource(thing.image);
        }
    }



}
