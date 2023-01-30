package com.company.companies.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.companies.model.Company;
import com.company.companies.repositories.CompanyRepository;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository repository;

    public List<Company> findAll (){
        List<Company> company = repository.findAll();
        return company;
        
    }

    public Optional<Company> findById (Integer id){
        Optional<Company> obj = repository.findById(id);
        return obj;
    }

    public Company create (Company company){
        company.setId(null);
        company = repository.save(company);
        return company;
    }


    public Company update (Integer id, Company company){
        company.setId(id);
        return repository.save(company);
    }

    public void delete (Integer id){
        repository.deleteById(id);
    }

    

    
}
