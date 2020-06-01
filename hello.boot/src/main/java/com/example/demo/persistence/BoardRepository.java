package com.example.demo.persistence;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.dto.TestDTO;

public interface BoardRepository extends CrudRepository<TestDTO, Long> {
	
}
