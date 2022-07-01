package com.example.microservizioarticolo.service;

import com.example.microservizioarticolo.repository.ArticoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ArticoloServiceImpl implements ArticoloService {

    @Autowired
    ArticoloRepository articoloRepository;

    @Autowired
    ArticoloConverter articoloConverter;


    @Override
    public void saveArticolo(Articolo articolo){
        articoloRepository.save(articolo);
    }


    @Override
    public List<ArticoloDto> findAll(){
        List<Articolo> articoli=articoloRepository.findAll();
        return articoloConverter.converterArticolo(articoli);
    }
}
