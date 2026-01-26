package org.example.aiaccess.policy;

import org.example.aiaccess.model.User;

import java.lang.management.MonitorInfo;

public class AgePolicy implements AccessPolicy,Explainable{

    @Override
    public boolean isAllowed(User user)
    {
        return user.getAge() >= MIN_AGE;
    }

    @Override
    public String explain(User user) {
        return "User must be at least " + MIN_AGE + " years old";
    }
}
