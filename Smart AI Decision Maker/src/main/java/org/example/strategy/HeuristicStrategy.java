package org.example.strategy;
import org.example.model.User;

public class HeuristicStrategy implements DecisionStrategy {
    @Override
    public boolean evaluate (User user) {
        return user.getCreditScore() > 700;
    }
}
