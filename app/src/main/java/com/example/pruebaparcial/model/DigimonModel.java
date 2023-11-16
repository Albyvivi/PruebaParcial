package com.example.pruebaparcial.model;

import com.google.gson.annotations.SerializedName;

public class DigimonModel {
    private  int id;
    private String title;
    @SerializedName("thumbnail")
    private String thumbnailURL;
    @SerializedName("short_description")
    private String short_description;

    public DigimonModel(int id, String title, String thumbnailURL, String short_description){
        this.id = id;
        this.title = title;
        this.thumbnailURL = thumbnailURL;
        this.short_description = short_description;
    }
    public String getTitle(){
        return title;
    }
    public String getThumbnailURL(){
        return thumbnailURL;
    }
    public String getShort_description(){
        return  short_description;
    }
}
