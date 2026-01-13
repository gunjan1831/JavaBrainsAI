package com.ai.app;

public class User {

    //AI Entity
    private String name;
    private int age;
    private String accountType;

    public User(String name, int age, String accountType) {
        this.name = name;
        this.age = age;
        this.accountType = accountType;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAccountType() {
        return accountType;
    }
//Encapsulation = AI doesn’t touch raw data.
}
