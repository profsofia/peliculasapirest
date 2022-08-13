package com.backalkemi.peliculas.rest;

import com.backalkemi.peliculas.exceptions.RespuestaNoEncontrado;
import com.backalkemi.peliculas.model.Persona;
import com.backalkemi.peliculas.repository.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonaRest {

    @Autowired
    private PersonaRepo personaRepo;
    @GetMapping("/verpersonajes")
    public List<Persona> verTodosLosPersonajes(){
        return personaRepo.findAll();
    }

    @GetMapping("/verunpersonaje/{id}")
    public ResponseEntity<Persona> buscarById(@PathVariable Long id){
        Persona persona = personaRepo.findById(id).orElseThrow(()->new RespuestaNoEncontrado("No se encontró el personaje que buscabas"));
        return ResponseEntity.ok(persona);
    }
    @PutMapping("/actualizarpersonaje/{id}")
    public ResponseEntity <Persona> actualizar(@PathVariable Long id, @RequestBody Persona editPersonaje){
        Persona persona = personaRepo.findById(id).orElseThrow(()->new RespuestaNoEncontrado("No se pudo actualizar el personaje"));
        persona.setImagen(editPersonaje.getImagen());
        persona.setEdad(editPersonaje.getEdad());
        persona.setNombre(editPersonaje.getNombre());
        persona.setPeso(editPersonaje.getPeso());
        persona.setHistoria(editPersonaje.getHistoria());
        persona.setPeliculas_seriesAsociadas(editPersonaje.getPeliculas_seriesAsociadas());
        Persona personajeActualizado = personaRepo.save(persona);
        return ResponseEntity.ok(personajeActualizado);
    }

    @PostMapping("/personaje")
    public Persona guardar(@RequestBody Persona persona){
        return personaRepo.save(persona);
    }


    @DeleteMapping("/personaje/{id}")
    public void deleteById (@PathVariable("id") Long id){
        personaRepo.deleteById(id);
    }
}
