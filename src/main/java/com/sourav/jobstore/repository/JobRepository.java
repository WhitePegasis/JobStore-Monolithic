package com.sourav.jobstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sourav.jobstore.model.Job;

public interface JobRepository extends JpaRepository<Job, Long>{

}
