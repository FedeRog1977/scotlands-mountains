package com.example.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.springboot.model.Hill;

public interface HillRepository extends MongoRepository<Hill, String> {}
