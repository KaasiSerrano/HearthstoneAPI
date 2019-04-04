package com.example.hearthstoneapi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.hearthstoneapi.retrofit.HearthstoneService;
import com.example.hearthstoneapi.retrofit.RetrofitClientInstance;
import com.example.hearthstoneapi.retrofit.adapter.SetsNameAdapter;
import com.example.hearthstoneapi.retrofit.adapter.CardAdapter;
import com.example.hearthstoneapi.retrofit.model.Cards;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AllCardsBrain extends AppCompatActivity implements SetsNameAdapter.OnSetClicked {

    private RecyclerView rvAllCards;
    SetsNameAdapter allcardAdapter;
    CardAdapter cardAdapter;
    private static final String TAG = "AllCardsBrain";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_cards_view);


        // init recyclerView
        rvAllCards = findViewById(R.id.rvAllCards);
        // Set LayoutManager
        // rvAllCards.setLayoutManager(new GridLayoutManager(this, ));
        rvAllCards.setLayoutManager(new LinearLayoutManager(AllCardsBrain.this));
        // Set ItemAnimator
        rvAllCards.setItemAnimator(new DefaultItemAnimator());
        // init Adapter and set to RecyclerView
        allcardAdapter = new SetsNameAdapter(this, new ArrayList<>(), this);
        cardAdapter = new CardAdapter(this, new ArrayList<>());
        rvAllCards.setAdapter(allcardAdapter);

        setupAdapterData();
        //cardSetRequest();
    }

    private void setupAdapterData() {
        allcardAdapter.setData(getSetNames());
    }

    private List<String> getSetNames() {
        List<String> setNames = new ArrayList<>();
        setNames.add("Basic");
        setNames.add("Knights of the Frozen Throne");
        setNames.add("Whispers of the Old Gods");
        setNames.add("The Boomsday Project");
        setNames.add("Goblins vs Gnomes");
        setNames.add("The Witchwood");
        setNames.add("The Grand Tournament");
        setNames.add("Journey to Un'Goro");
        setNames.add("Rastakhan's Rumble");
        setNames.add("Mean Streets of Gadgetzan");
        return setNames;
    }

    DisplaySetCards displaySetCards;

    @Override
    public void setClicked(String setName) {
        new DisplaySetCards().setSetName(setName);
        startActivity(new Intent(AllCardsBrain.this, DisplaySetCards.class));

    }
}


