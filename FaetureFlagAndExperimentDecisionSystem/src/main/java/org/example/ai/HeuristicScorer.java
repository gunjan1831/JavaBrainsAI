package org.example.ai;

import org.example.model.User;

public class HeuristicScorer {

    private final ScoreFunction scorer = user -> (user.isPremium() ? 30 :0) + (user.getActivityLevel() * 10)
                                        + (user.getAge() >= 25 ? 20 :10);

    public int calculateScore(User user)
    {
        return scorer.score(user);
    }

    public String explain(User user) {
        return "Score based on premium status, activity level, and age";
    }
}
