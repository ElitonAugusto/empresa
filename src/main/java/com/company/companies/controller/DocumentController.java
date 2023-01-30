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

import com.company.companies.service.DocumentService;
import com.company.companies.model.Document;

@RestController
@RequestMapping("/document")
public class DocumentController {

    @Autowired
    private DocumentService documentService;  


    @GetMapping
    public ResponseEntity<List<Document>> findAll(){
        List<Document> newDocument = documentService.findAll();

        List<Document> resposta = new ArrayList<Document>();
        resposta = newDocument;
        return new ResponseEntity<>(resposta, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Document>> findById (@PathVariable Integer id){
        Optional<Document> Document = documentService.findById(id);
        return new ResponseEntity<>(Document, HttpStatus.OK);
        
    }

    @PostMapping
    public ResponseEntity<Document> create (@RequestBody Document Document){
        Document newDocument  = documentService.create(Document );
        return new ResponseEntity<>(newDocument, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
         documentService.delete(id);
         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("{id}")
    public ResponseEntity<Document> update (@RequestBody Document Document, @PathVariable Integer id){
        Document newDocument  = documentService.update(id, Document );
        return new ResponseEntity<>(newDocument, HttpStatus.OK);
    }
    
}
