package org.example.rule;

import org.example.model.*;

public interface DecisionRule {

    boolean evaluate(User user, Feature feature);
}
