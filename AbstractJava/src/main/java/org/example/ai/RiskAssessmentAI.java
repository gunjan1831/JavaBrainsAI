package org.example.ai;



public class RiskAssessmentAI extends AbstractAIEngine {

    public RiskAssessmentAI() {
        super("Risk-AI"); // calls abstract constructor
    }

    // interface method implementation
    @Override
    public boolean predict(int score) {
        return score > 500;
    }

    // abstract method implementation
    @Override
    protected void log(boolean result) {
        System.out.println(
                result ? "LOW RISK" : "HIGH RISK"
        );
    }
}
