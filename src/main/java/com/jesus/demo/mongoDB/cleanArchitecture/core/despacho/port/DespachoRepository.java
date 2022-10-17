package com.jesus.demo.mongoDB.cleanArchitecture.core.despacho.port;

import com.jesus.demo.mongoDB.cleanArchitecture.core.despacho.model.Despacho;

public interface DespachoRepository {

    Despacho findById(String id);
}
