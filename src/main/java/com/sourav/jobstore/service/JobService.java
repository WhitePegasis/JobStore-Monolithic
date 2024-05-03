package com.sourav.jobstore.service;

import java.util.List;

import com.sourav.jobstore.model.Job;

public interface JobService {
	
	List<Job> findAll();
	
	void createJob(Job job);
	
	Job getJobById(Long id);

	boolean deleteJobById(Long id);

	boolean updateJob(Long id, Job updatedJob);

}
