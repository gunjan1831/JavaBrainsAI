package org.example;

import org.example.model.User;
import org.example.engine.AIDecisionEngine;
import org.example.strategy.HeuristicStrategy;
import org.example.strategy.MLScoreStrategy;
import org.example.rule.IncomeRule;

public class Main {

    public static void main(String[] args) {

        User user = new User(60000, 720, 0.85);

        // Rule Engine usage
        IncomeRule incomeRule = new IncomeRule();
        System.out.println("Income rule result: " +
                incomeRule.applyRule(user));

        // Strategy Engine usage
        AIDecisionEngine engine =
                new AIDecisionEngine(new HeuristicStrategy());

        System.out.println("Heuristic strategy: " +
                engine.decide(user));

        engine = new AIDecisionEngine(new MLScoreStrategy());

        System.out.println("ML strategy: " +
                engine.decide(user));
    }
}
