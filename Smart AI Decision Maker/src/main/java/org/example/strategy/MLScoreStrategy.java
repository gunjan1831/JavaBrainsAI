package org.example.strategy;
import org.example.model.User;

public class MLScoreStrategy implements DecisionStrategy {
    @Override
    public boolean evaluate (User user) {
        return user.getAiScore() > 0.8;
    }

}
