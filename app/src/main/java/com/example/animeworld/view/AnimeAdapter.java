package com.example.animeworld.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animeworld.R;
import com.example.animeworld.databinding.AnimeListItemBinding;
import com.example.animeworld.model.Anime;

import java.util.ArrayList;

public class AnimeAdapter  extends RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder> {


    private Context context;
    private ArrayList<Anime> animeArrayList;

    public AnimeAdapter(Context context, ArrayList<Anime> animeArrayList) {
        this.context = context;
        this.animeArrayList = animeArrayList;
    }

    @NonNull
    @Override
    public AnimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        AnimeListItemBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.anime_list_item,
                parent,
                false

        );

        return new AnimeViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeViewHolder holder, int position) {
        Anime anime = animeArrayList.get(position);
        holder.animeListItemBinding.setAnime(anime);
    }

    @Override
    public int getItemCount() {
        return animeArrayList.size();
    }

    public class AnimeViewHolder extends  RecyclerView.ViewHolder{
        private AnimeListItemBinding animeListItemBinding;

        public AnimeViewHolder(AnimeListItemBinding animeListItemBinding) {
            super(animeListItemBinding.getRoot());
            this.animeListItemBinding = animeListItemBinding;

            animeListItemBinding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}
