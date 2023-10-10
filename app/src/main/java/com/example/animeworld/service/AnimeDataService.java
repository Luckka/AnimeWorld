package com.example.animeworld.service;

import com.example.animeworld.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AnimeDataService {

    //https://api.jikan.moe/v4/top/anime

    @GET("top/anime")
    Call<Result> getPopularAnimes();


}
