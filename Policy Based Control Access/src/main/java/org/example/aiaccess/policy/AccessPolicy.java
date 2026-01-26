package org.example.aiaccess.policy;
import org.example.aiaccess.model.*;


public interface AccessPolicy {
//all interface rules lives here

    // Constants (implicitly public static final)
    int MIN_AGE = 18;
    int MAX_FAILEDATTEMPTS = 3;

    //abstract method implicitly public

    boolean isAllowed(User user);

    default String PolicyName() {
        return this.getClass().getSimpleName();
    }

    static void logDecision(String policyName, boolean result)
    {
        System.out.println("PolicyName: " + policyName);
        System.out.println(result ? "Result: Pass" : "Result: Fail");
    }

}
