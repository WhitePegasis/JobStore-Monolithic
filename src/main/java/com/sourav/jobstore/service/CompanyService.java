package com.sourav.jobstore.service;

import java.util.List;

import com.sourav.jobstore.model.Company;

public interface CompanyService {
    List<Company> getAllCompanies();
    boolean updateCompany(Company company, Long id);
    void createCompany(Company company);
    boolean deleteCompanyById(Long id);
    Company getCompanyById(Long id);
}
