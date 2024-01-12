package com.suikatchat.auth.dao.repository;

import com.suikatchat.auth.dao.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
}
