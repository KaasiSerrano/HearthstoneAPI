package com.example.hearthstoneapi;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GridViewBrain extends AppCompatActivity {
    String[] array_characters = {
            "a", "b", "c", "d", "e", "f", "g", "h",
            "i", "j", "k", "l", "m", "n", "o", "p",
            "q", "r", "s", "t", "u", "v", "w", "x",
            "y", "z"};


   private List<String> lstSource = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.favorites_page);


        setUpList();
        GridView gridView =  findViewById(R.id.master_grid_view);
        GridViewAdapater adapter = new GridViewAdapater(lstSource,this);
        gridView.setAdapter(adapter);


    }
    private void setUpList()
    {
for(String item:array_characters)
{
    lstSource.add(item);
}
    }
}
