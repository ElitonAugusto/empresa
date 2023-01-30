package com.company.companies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.companies.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {
    
}
