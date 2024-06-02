package com.job.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.job.entity.Job;

@Repository
public interface JobRepository extends JpaRepository<Job,Integer> {

}
