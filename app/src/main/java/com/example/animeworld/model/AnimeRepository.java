package com.example.animeworld.model;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class AnimeRepository {
    private ArrayList<Anime> animes = new ArrayList<>();

    private MutableLiveData<List<Anime>> mutableLiveData = new MutableLiveData<List<Anime>>();

    private Application application;

    public AnimeRepository(Application application) {
        this.application = application;
    }

    public MutableLiveData<List<Anime>> getMutableLiveData(){

    }
}
