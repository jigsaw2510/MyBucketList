package com.example.mybucketlist;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ThingsToDoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        setupList();
    }

    private void setupList() {
        RecyclerView list = findViewById(R.id.recycler_view_things);
        Thing[] things = {
                new Thing("Own a foosball business", "One of my dreams since I found out about foosball", R.drawable.icon_things_to_do),
                new Thing("Get the Associate Android Developer certificate", "Would be good for starting a career in Android Development", R.drawable.icon_things_to_do),
                new Thing("Get the Oracle Certified Associate certificate", "Would be good for starting a career in IT", R.drawable.icon_things_to_do),
                new Thing("Get the Android Certified Application Developer certificate", "The next step in pursuing an Android Developer career", R.drawable.icon_things_to_do),
                new Thing("Own a foosball business", "One of my dreams since I found out about foosball", R.drawable.icon_things_to_do),
                new Thing("Get the Associate Android Developer certificate", "Would be good for starting a career in Android Development", R.drawable.icon_things_to_do),
                new Thing("Get the Oracle Certified Associate certificate", "Would be good for starting a career in IT", R.drawable.icon_things_to_do),
                new Thing("Get the Android Certified Application Developer certificate", "The next step in pursuing an Android Developer career", R.drawable.icon_things_to_do),
                new Thing("Own a foosball business", "One of my dreams since I found out about foosball", R.drawable.icon_things_to_do),
                new Thing("Get the Associate Android Developer certificate", "Would be good for starting a career in Android Development", R.drawable.icon_things_to_do),
                new Thing("Get the Oracle Certified Associate certificate", "Would be good for starting a career in IT", R.drawable.icon_things_to_do),
                new Thing("Get the Android Certified Application Developer certificate", "The next step in pursuing an Android Developer career", R.drawable.icon_things_to_do),
                new Thing("Own a foosball business", "One of my dreams since I found out about foosball", R.drawable.icon_things_to_do),
                new Thing("Get the Associate Android Developer certificate", "Would be good for starting a career in Android Development", R.drawable.icon_things_to_do),
                new Thing("Get the Oracle Certified Associate certificate", "Would be good for starting a career in IT", R.drawable.icon_things_to_do),
                new Thing("Get the Android Certified Application Developer certificate", "The next step in pursuing an Android Developer career", R.drawable.icon_things_to_do)
        };
        ThingsAdapter adapter = new ThingsAdapter(things);
        list.setAdapter(adapter);
    }
}
