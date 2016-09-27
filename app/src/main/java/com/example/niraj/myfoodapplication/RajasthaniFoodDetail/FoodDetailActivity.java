package com.example.niraj.myfoodapplication.RajasthaniFoodDetail;

import android.support.annotation.NonNull;


public class FoodDetailActivity {


    @NonNull
    private String name;

    public FoodDetailActivity(@NonNull String name) {

        this.name = name;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }
}
