package com.backalkemi.peliculas.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Getter @Setter
public class PeliculaSerie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id_peli;
    String imagen;
    String titulo;
    String fechaDeCreacion;
    String Calificacion; //(del 1 al 5)
    String personajesAsociados;
}
