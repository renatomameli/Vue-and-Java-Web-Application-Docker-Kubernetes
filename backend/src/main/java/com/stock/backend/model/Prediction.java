package com.stock.backend.model;

public class Prediction {
    private final String prediction;

    public Prediction(String prediction){
        this.prediction = prediction;
    }

    public String getPrediction() {
        return prediction;
    }
}
