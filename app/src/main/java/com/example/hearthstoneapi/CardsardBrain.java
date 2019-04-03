package com.example.hearthstoneapi;

        import android.os.Bundle;
        import android.util.Log;
        import android.widget.GridView;
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

public class CardsardBrain extends AppCompatActivity {

    private RecyclerView rvCards;
    CardAdapter cardAdapter;
    private static final String TAG = "CardsardBrain";



    private List<String> lstSource = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_cards_view);


        // init recyclerView
        rvCards = findViewById(R.id.rvCards);
        // Set LayoutManager
        rvCards.setLayoutManager(new GridLayoutManager(CardsardBrain.this, 2));
//            rvCards.setLayoutManager(new LinearLayoutManager(SearchCardBrain.this));
        // Set ItemAnimator
        rvCards.setItemAnimator(new DefaultItemAnimator());
        // init Adapter and set to RecyclerView
        cardAdapter = new CardAdapter(CardsardBrain.this, new ArrayList<>());
        rvCards.setAdapter(cardAdapter);

        retrofitRequest();
    }
        private void retrofitRequest() {

            Log.d(TAG, "onCreate: CardName ");

            HearthstoneService hearthstoneService =
                    RetrofitClientInstance
                            .getRetrofit()
                            .create(HearthstoneService.class);


            Call<List<Cards>> call = hearthstoneService.loadFullCards();


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

                    }
                }


                @Override
                public void onFailure(Call<List<Cards>> call, Throwable t) {
                }
            });

        }
    }

