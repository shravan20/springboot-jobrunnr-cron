package com.nineleaps.cron.controllers;

import com.nineleaps.cron.jobs.SampleJob;

import org.jobrunr.scheduling.JobScheduler;
import org.jobrunr.storage.StorageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableScheduling
public class CronController {

    @Autowired
    private JobScheduler scheduler;

    @Autowired
    private SampleJob jobService;

    @GetMapping("/tcron")
    public String createCron() {
        scheduler.enqueue(()-> jobService.execute());
        return "Cron Created Successfully";
    }

    @GetMapping("/cron")
    public String createCronDelay() {
        scheduler.enqueue(()-> jobService.execute("Hello World"));
        return "Delayed Cron Created Successfully";
    }

}
