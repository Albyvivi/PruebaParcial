package com.example.pruebaparcial.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebaparcial.R;

public class GameHolder extends RecyclerView.ViewHolder {
    private TextView title;
    private TextView desc;
    private ImageView image;

    public GameHolder(@NonNull View viewItem){
        super(viewItem);
        title = viewItem.findViewById(R.id.title);
        desc= viewItem.findViewById(R.id.desc);
        image = viewItem.findViewById(R.id.imageView);
    }
    public TextView getTitle() {
        return title;
    }
    public TextView getDescription(){
        return desc;
    }
    public ImageView getImage(){
        return image;
    }


}
