package com.jesus.demo.mongoDB.controller;


import com.jesus.demo.mongoDB.model.Despacho;
import com.jesus.demo.mongoDB.repository.DespachoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/v1/despachos")
@RestController
public class DespachoRestController {

    private final DespachoRepository despachoRepository;

    public DespachoRestController(DespachoRepository despachoRepository) {
        this.despachoRepository = despachoRepository;
    }

    @GetMapping
    public Optional<Despacho> find(@RequestParam String id){
       return despachoRepository.findById(id);
    }

    @GetMapping("filter")
    public List<Despacho> find(String ubigeoInicio, String ubigeoDestino, Double weight){
        return despachoRepository.findAllForBestPrice(ubigeoInicio,ubigeoDestino,weight, Sort.by(Sort.Direction.ASC, "absoluteMoneyCost"));
    }
}
