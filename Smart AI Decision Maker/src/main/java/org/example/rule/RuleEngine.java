package org.example.rule;

import org.example.model.User;

public abstract class RuleEngine {

    public abstract boolean applyRule(User user);

    protected void log(String message) {
        System.out.println("Applying rules: " + message);
    }
}
