package com.example.hearthstoneapi.retrofit.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.hearthstoneapi.ClassSearch;
import com.example.hearthstoneapi.R;
import com.example.hearthstoneapi.SearchCardBrain;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SetsNameAdapter extends RecyclerView.Adapter<SetsNameAdapter.CardViewHolder> {
    private static final String TAG = "CardAdapter";
    private Context context;
    private List<String> setNames;
    SearchCardBrain searchCardBrain;
    //private Button clickableSetName;
    ClassSearch classSearch;
    private String setName;
    private OnSetClicked setClickedInterface;

    public SetsNameAdapter(Context context, List<String> setNames, OnSetClicked onSetClicked) {
        this.context = context;
        this.setNames = setNames;
        this.setClickedInterface = onSetClicked;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.all_cards_inside, parent, false);
        return new CardViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        String setName = this.setNames.get(position);
        holder.tv_setName.setText(setName);
    }

    @Override
    public int getItemCount() {
        return setNames.size();
    }

    public void setData(List<String> setNames) {
        this.setNames = setNames;
        notifyDataSetChanged();
    }

    class CardViewHolder extends RecyclerView.ViewHolder {
        private Button tv_setName;
        private MaterialCardView cardView;

        private CardViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_setName = itemView.findViewById(R.id.tv_SetName);
            cardView = itemView.findViewById(R.id.root);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setName = tv_setName.getText().toString();
                    setClickedInterface.setClicked(setName);
                }
            });
        }
    }

    public interface OnSetClicked {
        void setClicked(String setName);
    }

}





