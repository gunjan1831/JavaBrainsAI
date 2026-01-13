package com.ai.app;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AIBootstrap ai =  new AIBootstrap();

        User user = new User("Gunjan",24,"PREMIUM");
        Ticket ticket = new Ticket("PAYMENT");

        boolean eligible = ai.engine.isEligible(user);
        String team = ai.router.route(ticket);

        System.out.println("Routed to: " + team);
        ai.action.takeAction(eligible);

    }
}