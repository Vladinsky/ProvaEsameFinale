package com.example.microservizioarticolo.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Articolo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private Long id;
    @Column
    private String nomeArticolo;
    @Column
    private float prezzoArticolo;

    @Column
    private String testoRecensione;

    @Column
    private String idRecensione;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeArticolo() {
        return nomeArticolo;
    }

    public void setNomeArticolo(String nomeArticolo) {
        this.nomeArticolo = nomeArticolo;
    }

    public float getPrezzoArticolo() {
        return prezzoArticolo;
    }

    public void setPrezzoArticolo(float prezzoArticolo) {
        this.prezzoArticolo = prezzoArticolo;
    }

    public String getIdRecensione() {
        return idRecensione;
    }

    public void setIdRecensione(String idRecensione) {
        this.idRecensione = idRecensione;
    }

    public String getTestoArticoloRecensione() {
        return testoArticoloRecensione;
    }

    public void setTestoArticoloRecensione(String testoArticoloRecensione) {
        this.testoArticoloRecensione = testoArticoloRecensione;
    }
}
