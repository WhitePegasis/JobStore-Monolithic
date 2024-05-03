package com.sourav.jobstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sourav.jobstore.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
