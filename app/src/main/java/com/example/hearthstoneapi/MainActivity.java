package com.example.hearthstoneapi;

import android.os.Bundle;
import androidx.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private RequestQueue mQueue;
private Button button;
private TextView mTextResult;
private Constants constants;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextResult = findViewById(R.id.textView);
        button = findViewById(R.id.bottomButton);

        mQueue = Volley.newRequestQueue(this);



        button.setOnClickListener(this);







    }
    @Override
    public void onClick(View v) {
        jsonParse();
    }
    private void jsonParse()
    {
        String url = constants.BASE_URL;



    }




}



