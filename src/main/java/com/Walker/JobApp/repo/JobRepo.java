package com.Walker.JobApp.repo;

import com.Walker.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class JobRepo {

    List<JobPost> jobs=new ArrayList<>(Arrays.asList(
            new JobPost(1, "JavaDeveloper", "Full Stack", 4, List.of("Java", "Spring Boot", "React", "MySQL")),
            new JobPost(2, "BackendDeveloper", "API Development", 3, List.of("Java", "Spring Boot", "REST", "PostgreSQL")),
            new JobPost(3, "FrontendDeveloper", "UI Development", 2, List.of("HTML", "CSS", "JavaScript", "React")),
            new JobPost(4, "DataScientist", "Machine Learning", 5, List.of("Python", "Machine Learning", "Pandas", "TensorFlow")),
            new JobPost(5, "DevOpsEngineer", "Cloud Infrastructure", 3, List.of("AWS", "Docker", "Kubernetes", "Terraform"))

    ));
    public List<JobPost>getAllJob(){
    return jobs;
    }
    public void addJob(JobPost jobPost){
        jobs.add(jobPost);
        System.out.println(jobs);
    }
}
