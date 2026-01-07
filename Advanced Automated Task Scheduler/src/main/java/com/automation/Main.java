package com.automation;

import java.util.*;



import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {


    public static void main(String[] args)
    {
        System.out.println("Starting Advanced Automated Task Schduler...");

        //load tasks from config

        List<Task> tasks = ConfigLoader.loadTask("src/config/tasks.config");

        //schedule tasks
        TaskRunner runner = new TaskRunner();
        runner.scheduleTasks(tasks);

        //keep main thread alive
        try {
            Thread.sleep(60000); //run for a min
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        runner.shutdown();
        System.out.println("Task Scheduler stopped.");

    }
}
