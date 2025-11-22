package com.drlng.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.drlng.app.model.LoginResponse;

public interface  LoginResponseRepository extends MongoRepository<LoginResponse, String> {
}

