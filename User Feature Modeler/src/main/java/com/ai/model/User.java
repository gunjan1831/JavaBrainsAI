package com.ai.model;
import java.util.*;

public class User {

    private int userId;
    private String name;
    private List<Feature> features;


    public User(int userId,String name)
    {
        this.userId = userId;
        this.name = name;
        this.features = new ArrayList<>();
    }

    public int getUserId()
    {
       return userId;
    }

    public String getName() {
        return name;
    }

    public void addFeature(Feature feature)
    {
        features.add(feature);
    }

    public List<Feature> getFeatures()
    {
        return features;
    }

    //Object modeling and encapsulation
    //This is how AI systems stores each person
}
