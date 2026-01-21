package org.example.rule;

import org.example.model.User;

public class IncomeRule extends RuleEngine{

    @Override
    public boolean applyRule(User user) {
        log("Income Rule");
        return user.getIncome() > 50000;
    }
}
