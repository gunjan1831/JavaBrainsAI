package org.example.strategy;
import org.example.model.User;

public interface DecisionStrategy {
    /*
    Pure contract
    No shared logic
    Allows:
    Rule-based AI
    ML-based AI
    External API-based AI
    This is Strategy Pattern
    */

    boolean evaluate (User user);
}
