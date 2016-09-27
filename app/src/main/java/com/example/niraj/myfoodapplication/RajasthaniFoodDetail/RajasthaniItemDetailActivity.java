package com.example.niraj.myfoodapplication.RajasthaniFoodDetail;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;

/**
 * Created by Niraj on 9/26/2016.
 */
public class RajasthaniItemDetailActivity {

    @DrawableRes
    private int image;
    @NonNull
    private String name;

    public RajasthaniItemDetailActivity( int image, @NonNull String name) {
        this.image = image;
        this.name = name;
    }
    public int getImage() {
        return image;
    }

    public void setImage( int image) {
        this.image = image;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }
}
