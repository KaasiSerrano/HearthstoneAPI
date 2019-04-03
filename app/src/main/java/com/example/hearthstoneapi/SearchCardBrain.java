package com.example.hearthstoneapi;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class SearchCardBrain extends AppCompatActivity implements View.OnClickListener {

        private static final String TAG = "MainActivity";

        private Button button;
        private TextView mtextInput;
        private ImageView buttonImageView;
        private String cardName;
        private RecyclerView rvCards;
        CardAdapter cardAdapter;




        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.search_page);


            mtextInput = findViewById(R.id.textInput);
            button = findViewById(R.id.bottomButton);
            button.setOnClickListener(this);

    mtextInput.setOnEditorActionListener(new TextView.OnEditorActionListener() {
    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

        if(actionId == EditorInfo.IME_ACTION_DONE)
        {
            InputMethodManager imm = (InputMethodManager)v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(v.getWindowToken(), 0);

            button.performClick();
            return true;
        }

        return false;
    }
});



            // init recyclerView
            rvCards = findViewById(R.id.rvCards);
            // Set LayoutManager
            rvCards.setLayoutManager(new GridLayoutManager(SearchCardBrain.this, 2));
//            rvCards.setLayoutManager(new LinearLayoutManager(SearchCardBrain.this));
            // Set ItemAnimator
            rvCards.setItemAnimator(new DefaultItemAnimator());
            // init Adapter and set to RecyclerView
            cardAdapter = new CardAdapter(SearchCardBrain.this, new ArrayList<>());
            rvCards.setAdapter(cardAdapter);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.bottomButton: {
                    cardName = mtextInput.getText().toString();
                    retrofitRequest();
                }
                break;
            }

        }



    private void retrofitRequest() {

            Log.d(TAG, "onCreate: CardName " + cardName);

            HearthstoneService hearthstoneService =
                    RetrofitClientInstance
                            .getRetrofit()
                            .create(HearthstoneService.class);


            Call<List<Cards>> call = hearthstoneService.loadCards(cardName);


            call.enqueue(new Callback<List<Cards>>() {
                @Override
                public void onResponse(Call<List<Cards>> call, Response<List<Cards>> response) {

                    if (response.isSuccessful()) {
                        assert response.body() != null;

                        Log.d(TAG, "onResponse" + response.body());

                        cardAdapter.setData(response.body());


                    } else {
                        assert response.errorBody() != null;
                        Log.d(TAG, "onResponseError" + response.errorBody().toString());
                        Toast.makeText(SearchCardBrain.this, "Card Doesn't exist", Toast.LENGTH_SHORT).show();

                    }
                }
/*
               *//* private List<Cards> cardImage(List<Cards> cards)
                {
                    for(int i = 0; i<cards.size();i++)
                    {
                       if(cards.get(i).getImg()==null||cards.get(i).getImg().isEmpty())
                       {
                           cards.remove(i);
                       }
                    }*//*


        return cards;
    }*/


                @Override
                public void onFailure(Call<List<Cards>> call, Throwable t) {
                }
            });

        }
//TODO 1 Make HearthApp the title of the app
        //TODO 2 create MAIN PAGE with random card as well as fave button and search button
        //TODO 3 Create Faves page with list of favorite cards
    }