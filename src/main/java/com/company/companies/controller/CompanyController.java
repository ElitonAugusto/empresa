package com.company.companies.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.RestController;

import com.company.companies.model.Company;
import com.company.companies.service.CompanyService;

@RestController
@RequestMapping("/companie")
public class CompanyController {
    
    @Autowired
    private CompanyService companyService;  


    @GetMapping
    public ResponseEntity<List<Company>> findAll(){
        List<Company> newCompany = companyService.findAll();

        List<Company> resposta = new ArrayList<Company>();
        resposta = newCompany;
        return new ResponseEntity<>(resposta, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Company>> findById (@PathVariable Integer id){
        Optional<Company> company = companyService.findById(id);
        return new ResponseEntity<>(company, HttpStatus.OK);
        
    }

    @PostMapping
    public ResponseEntity<Company> create (@RequestBody Company company){
        Company newCompany  = companyService.create(company );
        return new ResponseEntity<>(newCompany, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
         companyService.delete(id);
         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("{id}")
    public ResponseEntity<Company> update (@RequestBody Company company, @PathVariable Integer id){
        Company newCompany  = companyService.update(id, company );
        return new ResponseEntity<>(newCompany, HttpStatus.OK);
    }
}

