package com.example.microservizioarticolo.service;

import java.util.List;
import com.example.microservizioarticolo.entity.Articolo;
import com.example.microservizioarticolo.articoloDto.ArticoloDto;

public interface ArticoloService {

    void saveArticolo(Articolo articolo);

    List<CorsoDto> findAll();
}
