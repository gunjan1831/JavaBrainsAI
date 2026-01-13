package com.ai.app;

public class ActionSelector {

    public void takeAction(boolean eligible)
    {
        if(eligible)
        {
            approve();
        }
        else {
            reject();
        }
    }

    private void approve() {
        System.out.println("AI Action: Service Approved");
    }

    private void reject() {
        System.out.println("AI Action: Service Rejected");
    }
}
