package com.backalkemi.peliculas.repository;

import com.backalkemi.peliculas.model.PeliculaSerie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaSerieRepo extends JpaRepository<PeliculaSerie, Long> {
}
