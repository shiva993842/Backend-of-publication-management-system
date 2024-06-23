package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Doc;
import com.example.demo.repository.DocRepo;

@RestController
@CrossOrigin("http://localhost:3000")
public class DocController {

	
	@Autowired
	private DocRepo repo;
	
	  @GetMapping("/getall")
	    List<Doc> getAlldata() {
	        return repo.findAll();
	    }
	  
	  @GetMapping("/getall/{id}")
	    Optional<Doc> getDocById(@PathVariable int id) {
	        return repo.findById(id);
	    }
	  
	  
}
