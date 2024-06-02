package com.job.service;

import java.util.List;

import com.job.entity.Job;

public interface JobService {

	public Job addJob(Job j);
	
	public Job updateJob(Job j);
	
	public List<Job>getAllJobs();
	
	public Job getJobById(int id);
	
	public String deleteJob(int id);
}
