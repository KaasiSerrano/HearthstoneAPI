package com.example.hearthstoneapi;


public class Constants {
    public static final String API_KEY = "1ac972ebecmsh72430e2defbda24p10ee96jsna89abb1b108f";
    public static final String BASE_URL = "https://omgvamp-hearthstone-v1.p.rapidapi.com/info";
    public static final String CARDS_API = "/cards";

}
/*
unirest.get("https://omgvamp-hearthstone-v1.p.rapidapi.com/info")
        .header("X-RapidAPI-Key", "1ac972ebecmsh72430e2defbda24p10ee96jsna89abb1b108f")
        .end(function (result) {
        console.log(result.status, result.headers, result.body);
        });*/
