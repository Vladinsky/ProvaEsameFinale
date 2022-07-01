package com.example.microservizioarticolo.converter;

import com.example.microservizioarticolo.articoloDto.ArticoloDto;
import com.example.microservizioarticolo.entity.Articolo;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;

@Component
public class ArticoloConverter {

    public List<ArticoloDto> converterArticolo(List<Articolo> articoli){

        List<ArticoloDto> listaDto = new ArrayList<ArticoloDto>();
        for(Articolo a: articoli){
            ArticoloDto a1 = new ArticoloDto();
            a1.setNomeArticolo(a.getNomeArticolo());
            a1.setTestoRecensione(a.getTestoRecensione());
            a1.setPrezzo(a.getPrezzoArticolo());
            listaDto.add(a1);
        }
        return listaDto;
    }
}
