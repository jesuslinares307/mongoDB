package com.jesus.demo.mongoDB.cleanArchitecture.infrastructure.repository.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("despachos")
public class DespachoEntity {
    private String _id;
    private String operadorLogistico;
    private String ubigeoInicio;
    private String ubigeoDestino;
    private String polygonName;


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getOperadorLogistico() {
        return operadorLogistico;
    }

    public void setOperadorLogistico(String operadorLogistico) {
        this.operadorLogistico = operadorLogistico;
    }

    public String getUbigeoInicio() {
        return ubigeoInicio;
    }

    public void setUbigeoInicio(String ubigeoInicio) {
        this.ubigeoInicio = ubigeoInicio;
    }

    public String getUbigeoDestino() {
        return ubigeoDestino;
    }

    public void setUbigeoDestino(String ubigeoDestino) {
        this.ubigeoDestino = ubigeoDestino;
    }

    public String getPolygonName() {
        return polygonName;
    }

    public void setPolygonName(String polygonName) {
        this.polygonName = polygonName;
    }
}
