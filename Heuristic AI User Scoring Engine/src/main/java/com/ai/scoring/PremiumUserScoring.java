package com.ai.scoring;

public class PremiumUserScoring extends ScoringStrategy{

    @Override
    public int calculateScore(User user) {
        int score = 0;

        score += user.getLoginCount() * 3;

        if(user.isPremium())
        {
            score +=30;
        }

        if(user.getDaysSinceLastLogin() < 3)
        {
            score += 20;
        }

        return score;
    }
}


