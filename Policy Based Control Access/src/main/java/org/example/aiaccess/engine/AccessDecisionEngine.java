package org.example.aiaccess.engine;

import org.example.aiaccess.model.User;
import org.example.aiaccess.policy.AccessPolicy;

import java.util.ArrayList;
import java.util.List;

public class AccessDecisionEngine {

    private List<AccessPolicy> policies = new ArrayList<>();

    public void addPolicy(AccessPolicy policy)
    {
        policies.add(policy);
    }

    public boolean evaluate(User user)
    {
        for (AccessPolicy policy : policies)
        {
            boolean result = policy.isAllowed(user);
            AccessPolicy.logDecision(
                    policy.PolicyName(),
                    result
            );
            if (!result) {
                return false;
            }

        }
        return true;
    }
}
