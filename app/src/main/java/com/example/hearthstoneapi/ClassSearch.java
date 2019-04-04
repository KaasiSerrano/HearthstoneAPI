package com.example.hearthstoneapi;

import android.os.Bundle;

import com.example.hearthstoneapi.retrofit.adapter.CardAdapter;

import java.util.ArrayList;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class ClassSearch extends AppCompatActivity {

    private static final String TAG = "MainActivity";


    private RecyclerView rvCards;
    CardAdapter cardAdapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_cards_view);


        // init recyclerView
        rvCards = findViewById(R.id.rvCards);
        // Set LayoutManager
        rvCards.setLayoutManager(new GridLayoutManager(ClassSearch.this, 2));
        //rvCards.setLayoutManager(new LinearLayoutManager(SearchCardBrain.this)); Set ItemAnimator
        rvCards.setItemAnimator(new DefaultItemAnimator());
        // init Adapter and set to RecyclerView
        cardAdapter = new CardAdapter(ClassSearch.this, new ArrayList<>());
        rvCards.setAdapter(cardAdapter);

    }

}
