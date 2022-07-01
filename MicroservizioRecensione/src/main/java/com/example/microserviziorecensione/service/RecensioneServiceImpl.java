package com.example.microserviziorecensione.service;

import com.example.microserviziorecensione.entity.Recensione;
import com.example.microserviziorecensione.repository.RecensioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RecensioneServiceImpl implements RecensioneService {

    @Autowired
    RecensioneRepository recensioneRepository;


    @Override
    public String getArticoloTestoById(Long id) {
        Recensione recensione = recensioneRepository.getReferenceById(id);
        return recensione.getArticolo() + " " + recensione.getTesto();
    }

    @Override
    public void save(Recensione recensione){
        recensioneRepository.save(recensione);
    }

    @Override
    public List<Recensione> findAll(){
        return recensioneRepository.findAll();
    }

    @Override
    public void deleteById(long id) {
        recensioneRepository.deleteById(id);
    }


    @Override
    public Optional<Recensione> findById(Long id){
        return recensioneRepository.findById(id);
    }


}
