package org.example.aiaccess;

import org.example.aiaccess.engine.AccessDecisionEngine;
import org.example.aiaccess.model.User;
import org.example.aiaccess.policy.AgePolicy;
import org.example.aiaccess.policy.PremiumPolicy;
import org.example.aiaccess.policy.SecurityPolicy;

public class Main {

    public static void main(String[] args) {

        User user = new User(23, true, 1);

        AccessDecisionEngine engine = new AccessDecisionEngine();

        engine.addPolicy(new AgePolicy());
        engine.addPolicy(new PremiumPolicy());
        engine.addPolicy(new SecurityPolicy());

        boolean decision = engine.evaluate(user);

        System.out.println(
                decision ? "\nACCESS GRANTED" : "\nACCESS DENIED"
        );
    }
}
