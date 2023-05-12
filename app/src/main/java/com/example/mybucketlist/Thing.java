package com.example.mybucketlist;

import androidx.annotation.DrawableRes;

public class Thing {
    String name;
    String description;
    int image;


    public Thing(String name, String description,@DrawableRes int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }
}


