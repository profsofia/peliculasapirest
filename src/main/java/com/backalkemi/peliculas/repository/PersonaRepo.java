package com.backalkemi.peliculas.repository;

import com.backalkemi.peliculas.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends JpaRepository<Persona, Long> {
}
