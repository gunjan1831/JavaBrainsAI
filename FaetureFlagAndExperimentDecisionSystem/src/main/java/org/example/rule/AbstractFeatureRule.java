package org.example.rule;

import org.example.model.*;

public abstract class AbstractFeatureRule implements DecisionRule{

    protected boolean isAdult(User user)
    {
        return user.getAge() >= 18;
    }

    protected boolean isActive (User user)
    {
        return user.getActivityLevel() > 5;
    }

    protected abstract boolean applyRule(User user,Feature feature);
    //why proetected ??


    @Override
    public boolean evaluate(User user, Feature feature) {
        return applyRule(user,feature);
    }
}
