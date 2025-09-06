package com.harshjaiswal.firstjobapp.job;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.List;


@RestController
public class JobController {
    private JobService JobService;

    public JobController(JobService jobService) {
        JobService = jobService;
    }

    @GetMapping("/jobs")
    public List<Job> findAll()
    {
        return JobService.findAll();
    }
    @PostMapping("/jobs")
    public String createjob(@RequestBody Job job){
        JobService.createJob(job);
        return "job added successfully";
    }
}
