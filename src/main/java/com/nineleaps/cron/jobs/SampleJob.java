package com.nineleaps.cron.jobs;
import java.io.*;

import org.jobrunr.jobs.annotations.Job;
import org.springframework.stereotype.Service;

@Service
public class SampleJob {


    @Job(name = "The sample job without variable")
    public void execute() {
        System.out.println("Hello world!");
        execute();
    }



    @Job(name = "The sample job with variable %0")
    public void execute(String input) {
        System.out.println("The sample job has begun. The variable you passed is {}"+ input);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Error while executing sample job"+ e);
        } finally {
            System.out.println("Sample job has finished...");
        }
    }

}