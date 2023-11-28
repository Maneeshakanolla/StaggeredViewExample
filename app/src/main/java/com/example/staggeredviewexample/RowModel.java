package com.example.staggeredviewexample;



public class RowModel {
    int actorsImage;
    String actorsName;

    public RowModel(int actorsImage, String actorsName) {
        this.actorsImage = actorsImage;
        this.actorsName = actorsName;
    }

    public int getActorsImage() {
        return actorsImage;
    }

    public void setActorsImage(int actorsImage) {
        this.actorsImage = actorsImage;
    }

    public String getActorsName() {
        return actorsName;
    }

    public void setActorsName(String actorsName) {
        this.actorsName = actorsName;
    }
}
