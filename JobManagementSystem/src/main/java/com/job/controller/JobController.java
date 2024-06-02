package com.job.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.job.entity.Job;
import com.job.service.JobServiceImpl;

@RestController
@RequestMapping("/api")
public class JobController {

	@Autowired
	JobServiceImpl service;
	
	@PostMapping("/addJob")
	public Job addJobDetails(@RequestBody Job j) {
		
		return service.addJob(j);
	}

	@PutMapping("/update/{id}")
		
		public Job updateJobDetails(@PathVariable("id") int id,@RequestBody Job j) {
		j.setId(id);
			return service.updateJob(j);
			
		}
		@GetMapping("/readAll")
		
		public List<Job>getAllJobInfo(){
			return service.getAllJobs();
			
		}
		@GetMapping("/read/{id}")
		public Job getJobbyId(@PathVariable("id")int id) {
			return service.getJobById(id);
		}
		@DeleteMapping("/delete/{id}")
		public String deletejobDetails(@PathVariable("id")int id) {
			return service.deleteJob(id);
		}
	
	
	
}
