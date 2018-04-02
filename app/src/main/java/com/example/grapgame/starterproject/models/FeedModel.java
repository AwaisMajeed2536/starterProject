package com.example.grapgame.starterproject.models;

public class FeedModel {

    private String key, value;

    public FeedModel() {
    }

    public FeedModel(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
