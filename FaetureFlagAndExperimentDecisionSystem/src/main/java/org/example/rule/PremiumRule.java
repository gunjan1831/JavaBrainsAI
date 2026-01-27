package org.example.rule;

import org.example.model.Feature;
import org.example.model.User;

public class PremiumRule extends AbstractFeatureRule{

    @Override
    protected boolean applyRule(User user, Feature feature)
    {
        if(feature.getType() == Feature.FeatureType.AI_RECOMMENDATION)
        {
            return user.isPremium();
        }
     return true;
    }
}
