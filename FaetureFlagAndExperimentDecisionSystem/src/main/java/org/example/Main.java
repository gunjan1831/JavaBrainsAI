package org.example;

import org.example.engine.DecisionResult;
import org.example.engine.FeatureDecisionEngine;
import org.example.model.Feature;
import org.example.model.User;
import org.example.rule.AgeRule;
import org.example.rule.PremiumRule;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        User user = new User(26, true, 6);
        Feature feature = new Feature(Feature.FeatureType.AI_RECOMMENDATION);

        FeatureDecisionEngine engine =
                new FeatureDecisionEngine(
                        Arrays.asList(
                                new AgeRule(),
                                new PremiumRule()
                        )
                );

        DecisionResult result = engine.decide(user, feature);

        System.out.println("Decision: " + result);
        System.out.println("Explanation: " + engine.explain(user));
    }
}
