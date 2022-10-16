package com.jesus.demo.mongoDB.repository;

import com.jesus.demo.mongoDB.model.Despacho;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DespachoRepository extends MongoRepository<Despacho,String> {

    @Query("{ubigeoInicio: ?0, ubigeoDestino: ?1, weightStart : {$lt: ?2}, weightEnd : { $gte: ?2}}")
    List<Despacho> findAllForBestPrice(String ubigeoInicio, String ubigeoDestino, Double weight, Sort sort);

    Optional<Despacho> findOneByOperadorLogistico(String operadorLogistico);

}

