package com.example.hearthstoneapi.retrofit;

import com.example.hearthstoneapi.Constants;
import com.example.hearthstoneapi.retrofit.model.Cards;
import com.example.hearthstoneapi.retrofit.model.Sets;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface HearthstoneService {


    @GET(Constants.CARDS_API)
    Call<List<Cards>> loadCards(@Path("name") String name);


    @GET(Constants.FULL_API)
    Call<Sets> loadFullCards();

    @GET(Constants.SET_SEARCH)
    Call<List<Cards>> loadSetCards(@Path("name") String name);


    /*
    @GET(Constants.IMAGES_SEARCH)
    Call<List<Image>> getBreedImage(@Query("breed_id") String breedId, @Query("limit") int limit);*/


}
