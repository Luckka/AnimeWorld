package com.example.animeworld.model;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.example.animeworld.R;
import com.example.animeworld.service.AnimeDataService;
import com.example.animeworld.service.RetrofitInstance;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AnimeRepository {
    private ArrayList<Anime> animes = new ArrayList<>();

    private MutableLiveData<List<Anime>> mutableLiveData = new MutableLiveData<List<Anime>>();

    private Application application;

    public AnimeRepository(Application application) {
        this.application = application;
    }

    public MutableLiveData<List<Anime>> getMutableLiveData(){
        AnimeDataService animeDataService = RetrofitInstance.getService();

        Call<Result> call = animeDataService.getPopularAnimes();

        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                Result result = response.body();

                if(result != null && result.getData() != null){
                    animes = (ArrayList<Anime>) result.getData();
                    mutableLiveData.setValue(animes);
                }
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {

            }
        });

        return mutableLiveData;
    }
}
