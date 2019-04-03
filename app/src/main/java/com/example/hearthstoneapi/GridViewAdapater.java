package com.example.hearthstoneapi;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import com.example.hearthstoneapi.retrofit.model.Cards;

import java.util.List;

public class GridViewAdapater extends BaseAdapter {


    List<String> lstSource;
    Context context;

    public GridViewAdapater(List<String> lstSource, Context context) {
        this.lstSource = lstSource;
        this.context = context;
    }
    @Override
    public int getCount() {
        return lstSource.size();
    }

    @Override
    public Object getItem(int position) {
        return lstSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Button button;

        if (convertView == null) {
            button = new Button(context);
            button.setLayoutParams(new GridView.LayoutParams(85, 85));
            button.setPadding(8, 8, 8, 8);
            button.setText(lstSource.get(position));
            button.setBackgroundColor(Color.RED);
            button.setTextColor(Color.YELLOW);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, button.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            });
        } else {
            button = (Button) convertView;
        }
        return button;

    }
}
