package com.ai.model;

public class Feature {

    private String name;
    private  double value;

    public Feature(String name, double  value)
    {
        this.name = name;
        this.value = value;
    }

    //Encapsultation controlled access

    public String getName() {
        return name;
    }

    public double  getValue() {
        return value;
    }

    public void setValue(double newValue)
    {
        this.value = newValue;
    }

}
