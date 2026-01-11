package com.ai.model;

public class Main {

    public static void main(String[] args) {

        User user1 = new User(1,"Gunjan");

        user1.addFeature(new Feature("Age",28));
        user1.addFeature(new Feature("MonthlySpending", 45000));
        user1.addFeature(new Feature("AppUsageHours", 5.5));

        UserFeatureService.printUserProfile(user1);
    }
}
