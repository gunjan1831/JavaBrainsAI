package org.example.aiaccess.model;

public class User {

    private int age;
    private boolean premium;
    private int failedAttempts;


    public User(int age, boolean premium, int failedAttempts) {
        this.age = age;
        this.premium = premium;
        this.failedAttempts = failedAttempts;
    }

    public int getAge() {
        return age;
    }

    public boolean isPremium() {
        return premium;

    }

    public int getFailedAttempts() {
        return failedAttempts;
    }
}
