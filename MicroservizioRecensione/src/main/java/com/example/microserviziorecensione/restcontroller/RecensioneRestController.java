package com.example.microserviziorecensione.restcontroller;

import com.example.microserviziorecensione.entity.Recensione;
import com.example.microserviziorecensione.service.RecensioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(value="/api/articolo")
public class RecensioneRestController {


    @Autowired
    RecensioneService recensioneService;

    @GetMapping(value="/getTestoArticoloById")
    public String getTestoArticoloById(@RequestParam Long id){

        return recensioneService.getArticoloTestoById(id);
    }

    @GetMapping(value = "/getRecensioni")
    public List<Recensione> getRecensioni(){
        return recensioneService.findAll();
    }

    @PostMapping(value="/addRecensione" )
    public String addRecensione(@RequestBody Recensione recensione){

        recensioneService.save(recensione);
        return "Recensione salvata";
    }

    @DeleteMapping(value="/deleteRecensione")
    public String deleteRecensione(@RequestBody Recensione recensione){

        recensioneService.deleteById((long)recensione.getId());
        return "Recensione eliminata";
    }

    @PutMapping(value="/updateRecensione")
    public String updateRecensione(@RequestBody Recensione recensione){

        if((Object)recensioneService.findById(recensione.getId())!=null && recensione.getId()!=null)
            recensioneService.save(recensione);
        return "Recensione modificata";
    }



}
