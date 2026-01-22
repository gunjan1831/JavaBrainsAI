package org.example.ai;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




                // ❌ NOT ALLOWED:
                // AbstractAIEngine engine = new AbstractAIEngine();

                AbstractAIEngine engine = new RiskAssessmentAI();
                engine.process(650);
            }



}