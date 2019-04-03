package com.example.hearthstoneapi.retrofit.model;

import com.google.gson.annotations.SerializedName;

public class MechanicsItem {

    @SerializedName("name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "MechanicsItem{" +
                        "name = '" + name + '\'' +
                        "}";
    }
}