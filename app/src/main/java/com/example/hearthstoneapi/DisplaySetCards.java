package com.example.hearthstoneapi;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.hearthstoneapi.retrofit.HearthstoneService;
import com.example.hearthstoneapi.retrofit.RetrofitClientInstance;
import com.example.hearthstoneapi.retrofit.adapter.CardAdapter;
import com.example.hearthstoneapi.retrofit.adapter.SetsNameAdapter;
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

public class DisplaySetCards extends AppCompatActivity {
Context context;
    private RecyclerView rvSetCards;
    String setName;
    CardAdapter cardAdapter;
    private static final String TAG ="DisplaySetCards" ;
    String thisIsTheNameOftheSet;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_set_cards);

        rvSetCards = findViewById(R.id.rvSetCards);
        // Set LayoutManager
        // rvSetCards.setLayoutManager(new GridLayoutManager(this, ));
        rvSetCards.setLayoutManager(new LinearLayoutManager(DisplaySetCards.this));
        // Set ItemAnimator
        rvSetCards.setItemAnimator(new DefaultItemAnimator());
        // init Adapter and set to RecyclerView
        cardAdapter = new CardAdapter(this, new ArrayList<>());
        rvSetCards.setAdapter(cardAdapter);
        cardSetRequest(setName);

    }
   public void setSetName(String setName)
    {
        thisIsTheNameOftheSet = setName;
    }

    public void cardSetRequest(String thisIsTheNameOftheSet) {

        Log.d(TAG, "onCreate: CardName " + thisIsTheNameOftheSet);

        HearthstoneService hearthstoneService =
                RetrofitClientInstance
                        .getRetrofit()
                        .create(HearthstoneService.class);


        Call<List<Cards>> call = hearthstoneService.loadSetCards(thisIsTheNameOftheSet);


        call.enqueue(new Callback<List<Cards>>() {
            @Override
            public void onResponse(Call<List<Cards>> call, Response<List<Cards>> response) {

                if (response.isSuccessful()) {
                    assert response.body() != null;

                    Log.d(TAG, "onResponse" + response.body());

                    rvSetCards.setAdapter(cardAdapter);
                    cardAdapter.setData(response.body());


                } else {
                    assert response.errorBody() != null;
                    Log.d(TAG, "onResponseError" + response.errorBody().toString());
                    Toast.makeText(DisplaySetCards.this, "Card Doesn't exist", Toast.LENGTH_SHORT).show();

                }
            }


            @Override
            public void onFailure(Call<List<Cards>> call, Throwable t) {
            }
        });

    }

}


