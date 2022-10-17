package com.jesus.demo.mongoDB.cleanArchitecture.adapter.repository;

import com.jesus.demo.mongoDB.cleanArchitecture.core.despacho.model.Despacho;
import com.jesus.demo.mongoDB.cleanArchitecture.core.despacho.port.DespachoRepository;
import com.jesus.demo.mongoDB.cleanArchitecture.infrastructure.repository.dao.DespachoDao;

public class DespachoAdapterRepository  implements DespachoRepository {

    private final DespachoDao despachoDao;

    public DespachoAdapterRepository(DespachoDao despachoDao) {
        this.despachoDao = despachoDao;
    }

    @Override
    public Despacho findById(String id) {
        return null;
    }
}
