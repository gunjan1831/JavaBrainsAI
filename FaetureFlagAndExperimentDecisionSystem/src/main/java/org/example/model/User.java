package org.example.model;

public class User {

    private int age;
    private boolean premium;
    private int activityLevel;

    public User(int age, boolean premium, int activityLevel) {
        this.age = age;
        this.premium = premium;
        this.activityLevel = activityLevel;
    }

    public int getAge() {
        return age;
    }

    public boolean isPremium() {
        return premium;
    }

    public int getActivityLevel() {
        return activityLevel;
    }
}
