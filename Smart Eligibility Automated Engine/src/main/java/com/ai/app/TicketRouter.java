package com.ai.app;

public class TicketRouter {

    public String route(Ticket ticket)
    {
        switch(ticket.getIssueType())
        {
            case "PAYMENT" : return "FINANCE TEAM";
            case "LOGIN"   : return "TECH SUPPORT";
            case "DELIVERU" : return "Operations";
            default : return "General Support";
        }
    }

    //Decision Tree Example
}
