package com.example.dogsapp.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity
public class DogBreed {
    @ColumnInfo(name = "breed_id")
    @SerializedName("id")
    public String breedID;

    @ColumnInfo(name = "dog_name")
    @SerializedName("name")
    public String dogBreed;

    @ColumnInfo(name = "life_span")
    @SerializedName("life_span")
    public String lifespan;

    @ColumnInfo(name = "breed_group")
    @SerializedName("breed_group")
    public String breedGroup;

    @ColumnInfo(name = "breef_for")
    @SerializedName("breed_for")
    public String bredFor;

    @ColumnInfo(name = "dog_url")
    @SerializedName("url")
    public String imageUrl;

    @PrimaryKey(autoGenerate = true)
    public int uuid;

    public String temperament;

    public DogBreed() {}

    public DogBreed(String breedID, String dogBreed, String lifespan, String breedGroup, String bredFor, String temperament, String imageUrl, int uui) {
        this.breedID = breedID;
        this.dogBreed = dogBreed;
        this.lifespan = lifespan;
        this.breedGroup = breedGroup;
        this.bredFor = bredFor;
        this.temperament = temperament;
        this.imageUrl = imageUrl;
        this.uuid = uui;
    }
}
