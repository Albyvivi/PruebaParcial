package com.example.pruebaparcial.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebaparcial.R;
import com.example.pruebaparcial.model.DigimonModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class GameAdapter extends RecyclerView.Adapter<GameHolder> {
    private final Context context;
    private final List<DigimonModel> games;

    public GameAdapter(Context context, List<DigimonModel> games){
        this.context = context;
        this.games = games;
    }
    @NonNull
    @Override
    public GameHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        return new GameHolder(LayoutInflater.from(context).inflate(R.layout.item_digimon, parent, false));
    }
    @Override
    public void onBindViewHolder(@NonNull GameHolder holder, int position){
        holder.getTitle().setText(games.get(position).getTitle());
        holder.getDescription().setText(games.get(position).getShort_description());
        Picasso.get().load(games.get(position).getThumbnailURL()).into(holder.getImage());
    }
    @Override
    public int getItemCount(){
        return games.size();
    }
}
