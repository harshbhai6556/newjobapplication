package com.harshjaiswal.firstjobapp.job;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class JobController {
    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    // READ ALL
    @GetMapping("/jobs")
    public List<Job> findAll() {
        return jobService.findAll();
    }

    // CREATE
    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job) {
        jobService.createJob(job);
        return "Job added successfully";
    }

    // READ BY ID
    @GetMapping("/jobs/{id}")
    public Job getJobById(@PathVariable Long id) {
        return jobService.getJobById(id);
    }
}