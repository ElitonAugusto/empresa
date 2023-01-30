package com.company.companies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.companies.model.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer> {
    
}
