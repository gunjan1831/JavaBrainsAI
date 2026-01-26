package org.example.aiaccess.policy;

import org.example.aiaccess.model.User;

public class SecurityPolicy implements AccessPolicy{

    @Override
    public boolean isAllowed(User user)
    {
        return user.getFailedAttempts() <= MAX_FAILEDATTEMPTS;
    }
}
