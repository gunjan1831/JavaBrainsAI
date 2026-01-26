package org.example.aiaccess.policy;

import org.example.aiaccess.model.User;

public class PremiumPolicy implements AccessPolicy{

    @Override
    public boolean isAllowed(User user)
    {
        return user.isPremium();
    }

    public void PrintCheck()
    {
        System.out.println("Premium Policy Check");
    }

}
