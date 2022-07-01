package com.example.microserviziorecensione.service;

import com.example.microserviziorecensione.entity.Recensione;
import java.util.List;
import java.util.Optional;

public interface RecensioneService {


    String getArticoloTestoById(Long id);
    public void save(Recensione recensione);

    public List<Recensione> findAll();

    void deleteById(long id);

    Optional<Recensione> findById(Long id);


}
