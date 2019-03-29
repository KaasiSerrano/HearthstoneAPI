package com.example.hearthstoneapi.retrofit;

import com.example.hearthstoneapi.Constants;
import com.example.hearthstoneapi.retrofit.model.Cards;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface HearthstoneService {




@GET(Constants.CARDS_API)
Call<List<Cards>> loadCards(@Query("limit") int limit);


    /*
    @GET(Constants.IMAGES_SEARCH)
    Call<List<Image>> getBreedImage(@Query("breed_id") String breedId, @Query("limit") int limit);*/


}
