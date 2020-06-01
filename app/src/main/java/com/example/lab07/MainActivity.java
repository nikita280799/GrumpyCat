package com.example.lab07;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecycleView();
    }

    private void initRecycleView() {
        RecyclerView recycleView = findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recycleView.setLayoutManager(layoutManager);

        RecyclerView.Adapter adapter = new GrumpyCatAdapter(generateCats());
        recycleView.setAdapter(adapter);
    }

    private static List<GrumpyCat> generateCats() {
        List<GrumpyCat> grumpyCats = new ArrayList<>();
        grumpyCats.add(new GrumpyCat("GrumpyCat1", "https://i.imgur.com/jzmAVVN.jpeg"));
        grumpyCats.add(new GrumpyCat("GrumpyCat2", "https://i.imgur.com/UP6lGsI.png"));
        grumpyCats.add(new GrumpyCat("GrumpyCat3", "https://i.imgur.com/skjA7aw.png"));
        grumpyCats.add(new GrumpyCat("GrumpyCat4", "https://i.imgur.com/jxGtCH2.jpg"));
        grumpyCats.add(new GrumpyCat("GrumpyCat5", "https://i.imgur.com/HacRj1A.jpg"));
        grumpyCats.add(new GrumpyCat("GrumpyCat6", "https://i.imgur.com/lcgdmll.jpeg"));
        grumpyCats.add(new GrumpyCat("GrumpyCat7", "https://i.imgur.com/juMvFE7.jpeg"));
        grumpyCats.add(new GrumpyCat("GrumpyCat8", "https://i.imgur.com/kAh2Ovr.jpeg"));
        grumpyCats.add(new GrumpyCat("GrumpyCat9", "https://i.imgur.com/eqZgJZN.jpeg"));
        grumpyCats.add(new GrumpyCat("GrumpyCat10", "https://i.imgur.com/RKLgESb.jpeg"));
        grumpyCats.add(new GrumpyCat("GrumpyCat11", "https://i.imgur.com/Yhvt3An.jpg"));
        return grumpyCats;
    }
}
