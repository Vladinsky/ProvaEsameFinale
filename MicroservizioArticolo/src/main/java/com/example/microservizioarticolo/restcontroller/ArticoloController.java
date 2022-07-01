package com.example.microservizioarticolo.restcontroller;


import com.example.microservizioarticolo.articoloDto.ArticoloDto;
import com.example.microservizioarticolo.entity.Articolo;
import com.example.microservizioarticolo.recensioneClient.RecensioneClient;
import com.example.microservizioarticolo.service.ArticoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/articolo")
public class ArticoloController {

    @Autowired
    ArticoloService articoloService;

    @Autowired
    RecensioneClient recensioneClient;

    @GetMapping(value="/getAllArticoli")
    public List<Articolo> getAllArticoli(){

        return null;
    }

    @PostMapping(value="/addArticolo")
    public String addarticolo(@RequestBody Articolo articolo,){
        articoloService.save(articolo);
        return "Articolo salvato";

    }
    @DeleteMapping(value="/deleteArticolo")
    public String deleteDocente/@RequestBody Articolo articolo){
        articoloService.deleteById((long)articolo.getId());
        return "Articolo eliminato";
    }

    @PutMapping(value="/updateRecensione")
    public String updateRecensione(@RequestBody Articolo articolo){
        String testoRecensione = RecensioneClient.getTestoRecensione(idRecensione);

        articolo.setTestoRecensione(testoRecensione);

        articoloService.saveArticolo(articolo);
        System.out.println("Recensione aggiunta");

    }

    @GetMapping(value "/getArticolo")
    public List<ArticoloDto> getArticolo(){

        return articoloService.findAll();
    }

}
