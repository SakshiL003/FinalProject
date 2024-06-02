package com.job.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.job.entity.Job;
import com.job.exception.JobNotFound;
import com.job.repo.JobRepository;

@Service
public class JobServiceImpl  implements JobService{

	@Autowired
	JobRepository repo;
	@Override
	public Job addJob(Job j) {
		
		return repo.save(j);
	}

	@Override
	public Job updateJob(Job j) {
		
		Optional<Job>newjob=repo.findById(j.getId());
		if(!newjob.isPresent()) {
			throw new JobNotFound("Searching job id not avaialable");
		}
		else {
			Job j2=newjob.get();
			
			j2.setJobName(j.getJobName());
			j2.setJobLocation(j.getJobLocation());
			j2.setJobDescription(j.getJobDescription());
			j2.setJobType(j.getJobType());
			repo.save(j2);
			return j2;
		}
	
	}

	@Override
	public List<Job> getAllJobs() {
		
		return repo.findAll();
	}

	@Override
	public Job getJobById(int id) {
		Optional<Job>newjob=repo.findById(id);
		if(!newjob.isPresent()) {
			throw new JobNotFound("Searching job id not avaialable");
		}
		else {
			
			
		return newjob.get();
	}
	}

	@Override
	public String deleteJob(int id) {

		Optional<Job>job=repo.findById(id);
		if(job.isPresent()) {
			 repo.delete(job.get());
		}
		else {
			throw new JobNotFound("Searching id not avaialable");
		};
		return "id deleted";
	}
		
	}


