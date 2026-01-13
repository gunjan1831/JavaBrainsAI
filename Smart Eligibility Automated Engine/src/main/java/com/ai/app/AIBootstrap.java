package com.ai.app;

public class AIBootstrap {

    EligibilityEngine engine;
    TicketRouter router;
    ActionSelector action;



    public AIBootstrap() {
        this(new EligibilityEngine());
    }

    public AIBootstrap(EligibilityEngine engine) {
        this.engine = engine;
        this.router = new TicketRouter();
        this.action = new ActionSelector();
    }

}
