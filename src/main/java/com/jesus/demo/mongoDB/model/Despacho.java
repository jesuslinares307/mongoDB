package com.jesus.demo.mongoDB.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;


@Document("despachos")
public class Despacho {
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

    public Integer getWeightStart() {
        return weightStart;
    }

    public void setWeightStart(Integer weightStart) {
        this.weightStart = weightStart;
    }

    public Integer getWeightEnd() {
        return weightEnd;
    }

    public void setWeightEnd(Integer weightEnd) {
        this.weightEnd = weightEnd;
    }

    public BigDecimal getAbsoluteMoneyCost() {
        return absoluteMoneyCost;
    }

    public void setAbsoluteMoneyCost(BigDecimal absoluteMoneyCost) {
        this.absoluteMoneyCost = absoluteMoneyCost;
    }

    public Integer getTimeCost() {
        return timeCost;
    }

    public void setTimeCost(Integer timeCost) {
        this.timeCost = timeCost;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private Integer weightStart;
    private Integer weightEnd;
    private BigDecimal absoluteMoneyCost;
    private Integer timeCost;
    private String country;


}
