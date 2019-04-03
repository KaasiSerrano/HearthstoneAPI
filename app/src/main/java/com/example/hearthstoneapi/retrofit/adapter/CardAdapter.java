package com.example.hearthstoneapi.retrofit.adapter;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.hearthstoneapi.R;
import com.example.hearthstoneapi.retrofit.model.Cards;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder>{
    private static final String TAG = "CardAdapter";
    private ImageView buttonImageView;
    private Context context;
    private List<Cards> cards;
    Boolean golden=false;
    public CardAdapter(Context context, List<Cards> cards) {
        this.context = context;
        this.cards = cards;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.card_item_view, parent, false);

        buttonImageView =  itemView.findViewById(R.id.iv_card_image);

        buttonImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.iv_card_image:
                    if (golden) {
                        golden = false;
                    } else {
                        golden = true;
                    }
                    notifyDataSetChanged();
                }
            }
        });

        return new CardViewHolder(itemView);


    }



    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Cards cards = this.cards.get(position);
        String url = cards.getImg();
        String urlGolden = cards.getImgGold();


        holder.tv_Mana.setText(Integer.toString(cards.getCost()));
        holder.tv_Flavor.setText(cards.getFlavor());
        holder.tv_Rarity.setText(cards.getRarity());
        holder.tv_Type.setText(cards.getType());
        holder.tv_Set.setText(cards.getCardSet());
        holder.tv_class.setText(cards.getPlayerClass());

        if(golden)
        {
            Log.d(TAG, "onBindViewHolder: "+ urlGolden);
            Glide.with(context).load(urlGolden).placeholder(R.drawable.error404card).into(holder.iv_Card_Image);
        }
        else
        {
            Glide.with(context).load(url).placeholder(R.drawable.error404card).into(holder.iv_Card_Image);

        }

    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    public void setData(List<Cards> strings) {


        this.cards = strings;

        notifyDataSetChanged();
    }

     class CardViewHolder extends RecyclerView.ViewHolder {
        private AppCompatTextView tv_Flavor;
        private AppCompatTextView tv_Mana;
         private AppCompatTextView tv_Rarity;
         private AppCompatTextView tv_Type;
        private AppCompatTextView tv_Set;
         private AppCompatTextView tv_class;

        private ImageView iv_Card_Image;

        private CardViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_Flavor = itemView.findViewById(R.id.tv_card_Flavor_);
            tv_Set = itemView.findViewById(R.id.tv_card_Set_);
            iv_Card_Image = itemView.findViewById(R.id.iv_card_image);
            tv_Mana = itemView.findViewById(R.id.tv_card_ManaCost_);
            tv_Rarity = itemView.findViewById(R.id.tv_card_Rarity_);
            tv_Type = itemView.findViewById(R.id.tv_card_Type_);
            tv_class = itemView.findViewById(R.id.tv_card_Class_);


        }
    }
}




