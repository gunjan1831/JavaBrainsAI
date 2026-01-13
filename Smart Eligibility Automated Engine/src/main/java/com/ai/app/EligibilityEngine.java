package com.ai.app;

public class EligibilityEngine {

    public boolean isEligible(User user)
    {
        if(user.getAge() > 18 && user.getAccountType().equals("PREMIUM"))
        {
            return true;
        }
        else
        {
            return false;
        }
        //rule based ai not ml
    }
}
