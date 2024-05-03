package com.sourav.jobstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sourav.jobstore.model.Job;
import com.sourav.jobstore.service.JobService;


@RestController
@RequestMapping("/jobs")
public class JobController {
	
	@Autowired
	private JobService jobService; 
	
	@GetMapping
//	@RequestMapping(value = "/jobs", method = RequestMethod.GET)
	public ResponseEntity<List<Job>> findAll(){
		return ResponseEntity.ok(jobService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Job> getJobById(@PathVariable Long id){
		
		Job job =  jobService.getJobById(id);
		
		if(job != null)
			return new ResponseEntity<>(job,HttpStatus.OK);
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping
	public ResponseEntity<String>ofindcreateJob(@RequestBody Job job){
		jobService.createJob(job);
		return new ResponseEntity<>("Job added successfully:)", HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteJob(@PathVariable Long id){
		boolean deleted = jobService.deleteJobById(id);
		
		if(deleted)
			return new ResponseEntity<>("Job deleted successfully", HttpStatus.OK);
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> updateJob(@PathVariable Long id, @RequestBody Job updatedJob){
		boolean updated = jobService.updateJob(id, updatedJob);
		
		if(updated)
			return new ResponseEntity<>("Job updated successfully:)", HttpStatus.OK);
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
