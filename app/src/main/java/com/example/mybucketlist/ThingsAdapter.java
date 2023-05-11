package com.example.mybucketlist;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ThingsAdapter extends RecyclerView.Adapter<ThingsAdapter.ThingViewHolder> {


    @NonNull
    @Override
    public ThingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ThingViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class ThingViewHolder extends RecyclerView.ViewHolder {
        public ThingViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
