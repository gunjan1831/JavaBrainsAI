package com.ai.model;

public class UserFeatureService {

    //This mimics an AI systems preprocessing layer

    public static double calculateFeatureScore(User user)
    {
        double sum =0 ;
        for(Feature f : user.getFeatures())
        {
            sum+=f.getValue();
        }

        return sum;
    }

    public static void printUserProfile(User user)
    {
        System.out.println("User: " + user.getName());
        System.out.println("Features:");

        for(Feature f : user.getFeatures())
        {
            System.out.println("Feature: " + f.getName() + ": " + f.getValue());
        }

        double score = calculateFeatureScore(user);
        System.out.println("AI Score: " + score);

        //Feature Aggregation- ML Concept
    }
}
