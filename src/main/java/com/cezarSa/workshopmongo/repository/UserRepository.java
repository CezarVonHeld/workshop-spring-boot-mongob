package com.cezarSa.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cezarSa.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
}
