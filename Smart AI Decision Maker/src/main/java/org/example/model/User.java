package org.example.model;

public class User {


    /*
    Represent AI Input Data
    Represents features in AI
    Same idea as feature vector
    Clean encapsulation - real ML pipelines do that

    */
    private int income;
    private int creditScore;
    private double aiScore;

    public User(int income, int creditScore, double aiScore) {
        this.income = income;
        this.creditScore = creditScore;
        this.aiScore = aiScore;
    }

    public int getIncome() {
        return income;
    }

    public int getCreditScore() {
        return creditScore;
    }
    public double getAiScore() {
        return aiScore;
    }


}
