package org.example.engine;

import org.example.model.User;
import org.example.strategy.DecisionStrategy;

public class AIDecisionEngine {

    private DecisionStrategy strategy;

    public AIDecisionEngine(DecisionStrategy strategy) {
        this.strategy = strategy;

    }

    public boolean decide(User user)
    {
        return strategy.evaluate(user);
    }
}
