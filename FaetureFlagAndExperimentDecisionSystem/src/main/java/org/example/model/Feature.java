package org.example.model;

public class Feature {

    public enum FeatureType
    {
        SEARCH_V2,
        DARK_MODE,
        AI_RECOMMENDATION
    }

    private FeatureType type;
    private String name;

    public Feature(FeatureType type)
    {
        this(type,type.name());
    }
  //recursive constructor call
    public Feature(FeatureType type, String name) {
        this.type = type;
        this.name = name;
    }

    public FeatureType getType()
    {
        return type;
    }

    public String getName()
    {
        return name;
    }
}
