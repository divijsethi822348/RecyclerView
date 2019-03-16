package com.example.recyclerview.Activities;

public class Model {
    private int pp,image;
    private String name;

    public Model(int pp, int image, String name) {
        this.pp = pp;
        this.image = image;
        this.name = name;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
