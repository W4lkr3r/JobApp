package com.Walker.JobApp;

import com.Walker.JobApp.model.JobPost;
import com.Walker.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {
    @Autowired
    private JobService service;
   @GetMapping({"/","home"})
    public String home(){
        return "Home";
    }

    @GetMapping("addjob")
    public String addjob(){
       return "addJob";
    }
    @PostMapping("/handleForm")
    public String handleForm(@ModelAttribute JobPost jobpost, Model model) {
        // Debug to ensure the object is received



      model.addAttribute("jobpost", jobpost);
      service.addJob(jobpost);

      return "success";
    }

    @GetMapping("/viewalljobs")
    public String viewall(Model model){

        List<JobPost> jobs= service.getAllJobs();

    model.addAttribute("jobPosts", jobs);
       return "viewallJobs";
    }

}
