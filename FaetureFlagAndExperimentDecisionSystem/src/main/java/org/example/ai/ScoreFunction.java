package org.example.ai;

import org.example.model.*;

@FunctionalInterface
public interface ScoreFunction {

    int score(User user);


}
