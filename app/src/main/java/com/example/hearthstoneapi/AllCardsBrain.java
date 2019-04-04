package com.example.hearthstoneapi;

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

    @Override
    public void setClicked(String setName) {
        cardSetRequest(setName);
/*
        if (setName.equals("Basic")) {
            Toast.makeText(this, setName, Toast.LENGTH_SHORT).show();
            cardSetRequest(setName);
        }
        if (setName.equals("Knights of the Frozen Throne")) {
            Toast.makeText(this, setName, Toast.LENGTH_SHORT).show();

            //TODO show cards from above class
        }
        if (setName.equals("Whispers of the Old Gods")) {
            Toast.makeText(this, setName, Toast.LENGTH_SHORT).show();

            //TODO show cards from above class
        }
        if (setName == "The Boomsday Project") {
            Toast.makeText(this, setName, Toast.LENGTH_SHORT).show();

            //TODO show cards from above class
        }
        if (setName == "Goblins vs Gnomes") {
            Toast.makeText(this, setName, Toast.LENGTH_SHORT).show();

            //TODO show cards from above class
        }
        if (setName == "The Witchwood") {
            Toast.makeText(this, setName, Toast.LENGTH_SHORT).show();

            //TODO show cards from above class
        }
        if (setName == "The Grand Tournament") {
            Toast.makeText(this, setName, Toast.LENGTH_SHORT).show();

            //TODO show cards from above class
        }
        if (setName == "Journey to Un'Goro") {
            Toast.makeText(this, setName, Toast.LENGTH_SHORT).show();

            //TODO show cards from above class
        }
        if (setName == "Rastakhan's Rumble") {
            Toast.makeText(this, setName, Toast.LENGTH_SHORT).show();

            //TODO show cards from above class
        }
        if (setName == "Mean Streets of Gadgetzan") {
            Toast.makeText(this, setName, Toast.LENGTH_SHORT).show();

            //TODO show cards from above class
        }*/

    }

    public void cardSetRequest(String SetName) {

        Log.d(TAG, "onCreate: CardName " + SetName);

        HearthstoneService hearthstoneService =
                RetrofitClientInstance
                        .getRetrofit()
                        .create(HearthstoneService.class);


        Call<List<Cards>> call = hearthstoneService.loadSetCards(SetName);


        call.enqueue(new Callback<List<Cards>>() {
            @Override
            public void onResponse(Call<List<Cards>> call, Response<List<Cards>> response) {

                if (response.isSuccessful()) {
                    assert response.body() != null;

                    Log.d(TAG, "onResponse" + response.body());

                    rvAllCards.setAdapter(cardAdapter);
                    cardAdapter.setData(response.body());


                } else {
                    assert response.errorBody() != null;
                    Log.d(TAG, "onResponseError" + response.errorBody().toString());
                    Toast.makeText(AllCardsBrain.this, "Card Doesn't exist", Toast.LENGTH_SHORT).show();

                }
            }


            @Override
            public void onFailure(Call<List<Cards>> call, Throwable t) {
            }
        });

    }

}

