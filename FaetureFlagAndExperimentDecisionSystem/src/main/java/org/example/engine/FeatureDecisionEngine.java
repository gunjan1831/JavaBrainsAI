package org.example.engine;

import org.example.ai.HeuristicScorer;
import org.example.model.Feature;
import org.example.model.User;
import org.example.rule.DecisionRule;

import java.util.List;

public class FeatureDecisionEngine {

    private List<DecisionRule> rules;
    private HeuristicScorer scorer = new HeuristicScorer();

    public FeatureDecisionEngine(List<DecisionRule> rules) {
        this.rules = rules;
    }

    public DecisionResult decide(User user, Feature feature) {

        for (DecisionRule rule : rules) {
            if (!rule.evaluate(user, feature)) {
                return DecisionResult.DISABLED;
            }
        }

        int score = scorer.calculateScore(user);

        switch (feature.getType()) {
            case AI_RECOMMENDATION:
                return score >= 70
                        ? DecisionResult.ENABLED
                        : DecisionResult.ENABLED_FOR_EXPERIMENT;

            default:
                return DecisionResult.ENABLED;
        }
    }

    public String explain(User user) {
        return scorer.explain(user);
    }
}
