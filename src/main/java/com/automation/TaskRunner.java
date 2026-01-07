package com.automation;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TaskRunner {

    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(5);

    public void scheduleTasks(List<Task> tasks) {
        for(Task task : tasks)
        {
            scheduler.scheduleAtFixedRate(task::Execute,0,task.getInterval(), TimeUnit.SECONDS);

        }
    }

    public void shutdown()
    {
        scheduler.shutdown();
    }

}

