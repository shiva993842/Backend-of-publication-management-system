package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Doc;

public interface DocRepo extends JpaRepository<Doc,Integer>{

	Optional<Doc> findAllById(int id);
}
