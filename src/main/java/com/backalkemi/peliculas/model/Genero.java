package com.backalkemi.peliculas.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id_genero;
    String nombre;
    String imagen;
    String peliculas_seriesAsociadas;
}
