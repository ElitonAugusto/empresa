package com.company.companies.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.companies.model.Document;
import com.company.companies.repositories.DocumentRepository;

@Service
public class DocumentService {
    
    @Autowired
    private DocumentRepository repository;

    public List<Document> findAll (){
        List<Document> document = repository.findAll();
        return document;
        
    }

    public Optional<Document> findById (Integer id){
        Optional<Document> obj = repository.findById(id);
        return obj;
    }

    public Document create (Document document){
        document.setId(null);
        document = repository.save(document);
        return document;
    }


    public Document update (Integer id, Document document){
        document.setId(id);
        return repository.save(document);
    }

    public void delete (Integer id){
        repository.deleteById(id);
    }

}
