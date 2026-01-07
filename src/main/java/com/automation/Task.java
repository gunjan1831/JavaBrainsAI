package com.automation;

public class Task {

    private String name;
    private int interval;
    public Task(String name, int interval) {
        this.name = name;
        this.interval = interval;
    }

    public String getName() {
        return name;
    }

    public int getInterval() {
        return interval;
    }


    public void Execute()
    {
        System.out.println("Executing Tasks: " + name + "at" + java.time.LocalTime.now());

        //Action Based on Tasks What will happen when
        switch(name)
        {
            case "CleanTempFiles":
                System.out.println("Cleaning temp files");
                break;
            case "GenerateReport":
                System.out.println("Generating report");
                break;
            case "BackupData":
                System.out.println("Backup data");
                break;
            default:
                System.out.println("Invalid task name");
        }
    }
}
