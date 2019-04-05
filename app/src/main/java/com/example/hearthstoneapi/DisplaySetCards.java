package com.example.hearthstoneapi;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.hearthstoneapi.retrofit.HearthstoneService;
import com.example.hearthstoneapi.retrofit.RetrofitClientInstance;
import com.example.hearthstoneapi.retrofit.adapter.CardAdapter;
import com.example.hearthstoneapi.retrofit.model.Cards;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


    public class DisplaySetCards extends AppCompatActivity {

        private static final String TAG = "MainActivity";

        private String ThisIsSetName;
        private RecyclerView rvCards;
        CardAdapter cardAdapter;


        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.display_set_cards);

            ThisIsSetName = getIntent().getStringExtra("setName");



            // init recyclerView
            rvCards = findViewById(R.id.rvCards);
            // Set LayoutManager
            rvCards.setLayoutManager(new GridLayoutManager(DisplaySetCards.this, 2));
            //rvCards.setLayoutManager(new LinearLayoutManager(SearchCardBrain.this)); Set ItemAnimator
            rvCards.setItemAnimator(new DefaultItemAnimator());
            // init Adapter and set to RecyclerView
            cardAdapter = new CardAdapter(DisplaySetCards.this, new ArrayList<>());
            rvCards.setAdapter(cardAdapter);



            retrofitRequest();



        }





        public void retrofitRequest() {



            Log.d(TAG, "onCreate: CardName " + ThisIsSetName);

            HearthstoneService hearthstoneService =
                    RetrofitClientInstance
                            .getRetrofit()
                            .create(HearthstoneService.class);


            Call<List<Cards>> call = hearthstoneService.loadSetCards(ThisIsSetName);


            call.enqueue(new Callback<List<Cards>>() {
                @Override
                public void onResponse(Call<List<Cards>> call, Response<List<Cards>> response) {

                    if (response.isSuccessful()) {
                        assert response.body() != null;

                        Log.d(TAG, "onResponse" + response.body());


                        cardAdapter.setData(response.body());
                        rvCards.setAdapter(cardAdapter);



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