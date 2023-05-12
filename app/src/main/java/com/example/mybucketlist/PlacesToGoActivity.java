package com.example.mybucketlist;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesToGoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setupList();
    }

    private void setupList() {
        RecyclerView list =findViewById(R.id.recycler_view_places);
        Place[] places ={
                new Place("Japonia", "Un loc in care vreau sa ajung de cand am aflat despre cultura japonezilor", R.drawable.icon_places_to_go),
                new Place("Japonia", "Un loc in care vreau sa ajung de cand am aflat despre cultura japonezilor", R.drawable.icon_places_to_go),
                new Place("Japonia", "Un loc in care vreau sa ajung de cand am aflat despre cultura japonezilor", R.drawable.icon_places_to_go),
                new Place("Japonia", "Un loc in care vreau sa ajung de cand am aflat despre cultura japonezilor", R.drawable.icon_places_to_go),
                new Place("Japonia", "Un loc in care vreau sa ajung de cand am aflat despre cultura japonezilor", R.drawable.icon_places_to_go),
                new Place("Japonia", "Un loc in care vreau sa ajung de cand am aflat despre cultura japonezilor", R.drawable.icon_places_to_go),
                new Place("Japonia", "Un loc in care vreau sa ajung de cand am aflat despre cultura japonezilor", R.drawable.icon_places_to_go),
                new Place("Japonia", "Un loc in care vreau sa ajung de cand am aflat despre cultura japonezilor", R.drawable.icon_places_to_go),
                new Place("Japonia", "Un loc in care vreau sa ajung de cand am aflat despre cultura japonezilor", R.drawable.icon_places_to_go),
                new Place("Japonia", "Un loc in care vreau sa ajung de cand am aflat despre cultura japonezilor", R.drawable.icon_places_to_go),
                new Place("Japonia", "Un loc in care vreau sa ajung de cand am aflat despre cultura japonezilor", R.drawable.icon_places_to_go),
                new Place("Japonia", "Un loc in care vreau sa ajung de cand am aflat despre cultura japonezilor", R.drawable.icon_places_to_go),
                new Place("Japonia", "Un loc in care vreau sa ajung de cand am aflat despre cultura japonezilor", R.drawable.icon_places_to_go),
                new Place("Japonia", "Un loc in care vreau sa ajung de cand am aflat despre cultura japonezilor", R.drawable.icon_places_to_go),
                new Place("Japonia", "Un loc in care vreau sa ajung de cand am aflat despre cultura japonezilor", R.drawable.icon_places_to_go),
                new Place("Japonia", "Un loc in care vreau sa ajung de cand am aflat despre cultura japonezilor", R.drawable.icon_places_to_go),
                new Place("Japonia", "Un loc in care vreau sa ajung de cand am aflat despre cultura japonezilor", R.drawable.icon_places_to_go),
                new Place("Japonia", "Un loc in care vreau sa ajung de cand am aflat despre cultura japonezilor", R.drawable.icon_places_to_go),
                new Place("Japonia", "Un loc in care vreau sa ajung de cand am aflat despre cultura japonezilor", R.drawable.icon_places_to_go),
                new Place("Japonia", "Un loc in care vreau sa ajung de cand am aflat despre cultura japonezilor", R.drawable.icon_places_to_go)
        };
        PlacesAdapter adapter = new PlacesAdapter(places);
        list.setAdapter(adapter);
    }
}
