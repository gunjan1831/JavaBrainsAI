package com.ai.scoring;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = new User(10,true,2);
        User user2 = new User(10,false,20);
        ScoringStrategy strategy ;
        strategy = new BasicUserScoring();
        System.out.println("Basic Score" + strategy.calculateScore(user));


        //polymorphism
        strategy = new PremiumUserScoring();
        System.out.println("Premium Score" + strategy.calculateScore(user2));

        }
    }
