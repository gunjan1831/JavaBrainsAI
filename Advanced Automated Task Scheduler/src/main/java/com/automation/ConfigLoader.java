package com.automation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class ConfigLoader {

    public static List<Task> loadTask(String filePath)
    {
        List<Task> tasks = new ArrayList<>();
        try (BufferedReader br  = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            while((line = br.readLine()) != null)
            {
                line = line.trim();
                if(line.isEmpty() || line.startsWith("#")) continue;
                String[] parts = line.split(",");
                String name = parts[0];
                int interval = Integer.parseInt(parts[1]);
                tasks.add(new Task(name, interval));

            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return tasks;
    }
}
