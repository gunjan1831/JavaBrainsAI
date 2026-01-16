package com.ai.scoring;

public class User {
    private int loginCount;
    private boolean premium;
    private int daysSinceLastLogin;

    public User(int loginCount, boolean premium, int daysSinceLastLogin) {
        this.loginCount = loginCount;
        this.premium = premium;
        this.daysSinceLastLogin = daysSinceLastLogin;
    }

    public int getLoginCount() {
        return loginCount;
    }

    public boolean isPremium() {
        return premium;
    }
    public int getDaysSinceLastLogin() {
        return daysSinceLastLogin;
    }

    //Represents AI input features
}
