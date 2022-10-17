package com.jesus.demo.mongoDB.cleanArchitecture.infrastructure.repository.dao;

import com.jesus.demo.mongoDB.cleanArchitecture.infrastructure.repository.entity.DespachoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DespachoDao extends MongoRepository<DespachoEntity, String> {
}
