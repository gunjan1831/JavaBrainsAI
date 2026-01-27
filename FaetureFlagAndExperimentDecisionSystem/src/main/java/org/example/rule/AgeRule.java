package org.example.rule;

import org.example.model.Feature;
import org.example.model.User;

public class AgeRule extends AbstractFeatureRule{

    @Override
    protected boolean applyRule(User user, Feature feature)
    {
        return isAdult(user);
    }
}
