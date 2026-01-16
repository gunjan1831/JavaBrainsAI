package com.ai.scoring;

public class BasicUserScoring extends ScoringStrategy{

    @Override
    public int calculateScore(User user) {
        int score = 0;
        score+= user.getLoginCount() * 2;

        if(user.getDaysSinceLastLogin() < 5)
        {
            score+=10;
        }

        return score;
    }

}
