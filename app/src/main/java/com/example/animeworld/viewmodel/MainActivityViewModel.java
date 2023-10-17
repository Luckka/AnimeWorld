package com.example.animeworld.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.animeworld.model.Anime;
import com.example.animeworld.model.AnimeRepository;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    private AnimeRepository repository;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        this.repository = new AnimeRepository(application);
    }

    public LiveData<List<Anime>> getAllAnimes(){

        return repository.getMutableLiveData();

    }

}
