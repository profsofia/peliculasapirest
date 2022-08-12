package com.backalkemi.peliculas.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String imagen;
    String nombre;
    String edad;
    String peso;
    String historia;
    String peliculas;
    String peliculas_seriesAsociadas;

}
