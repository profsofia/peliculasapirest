package com.backalkemi.peliculas.repository;

import com.backalkemi.peliculas.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepo extends JpaRepository<Genero, Long> {
}
