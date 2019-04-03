package com.example.hearthstoneapi;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";

    Button gotoFaves;
    Button gotoSearch;
    Button gotoCards;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);


        gotoFaves = this.findViewById(R.id.button_GOTO_Faves);
        gotoFaves.setOnClickListener(this);


        gotoSearch = this.findViewById(R.id.button_GOTO_Search);
        gotoSearch.setOnClickListener(this);

        gotoCards = this.findViewById(R.id.button_GOTO_Cards);
        gotoCards.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button_GOTO_Faves:
            {
                startActivity(new Intent(MainActivity.this,GridViewBrain.class));
            }break;
            case R.id.button_GOTO_Search:
            {
                startActivity(new Intent(MainActivity.this,SearchCardBrain.class));
            }break;
            case R.id.button_GOTO_Cards:
            {

                startActivity(new Intent(MainActivity.this,CardsardBrain.class));
            }break;

        }

    }
}



