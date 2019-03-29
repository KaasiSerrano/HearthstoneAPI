package com.example.hearthstoneapi;

import android.os.Bundle;
import androidx.annotation.Nullable;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.hearthstoneapi.retrofit.HearthstoneService;
import com.example.hearthstoneapi.retrofit.RetrofitClientInstance;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private RequestQueue mQueue;
private Button button;
private TextView mTextResult;
private Constants constants;

Retrofit retrofit;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextResult = findViewById(R.id.textView);
        button = findViewById(R.id.bottomButton);

        mQueue = Volley.newRequestQueue(this);

        button.setOnClickListener(this);


        retrofitRequest();





    }
    @Override
    public void onClick(View v) {
        jsonParse();
    }
    private void jsonParse()
    {
        String url = constants.BASE_URL;



    }
    private void retrofitRequest() {
        HearthstoneService hearthstoneService =
                RetrofitClientInstance
                        .getRetrofit()
                        .create(HearthstoneService.class);


        Call<List<String>> call = hearthstoneService.loadCards("call to arms");

call.enqueue(new Callback<List<String>>() {
    @Override
    public void onResponse(Call<List<String>> call, Response<List<String>> response) {

    }

    @Override
    public void onFailure(Call<List<String>> call, Throwable t) {

    }
});

    }

}



