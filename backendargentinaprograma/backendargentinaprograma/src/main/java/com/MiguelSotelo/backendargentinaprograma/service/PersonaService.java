package com.MiguelSotelo.backendargentinaprograma.service;

import com.MiguelSotelo.backendargentinaprograma.exception.UserNotFoundException;
import com.MiguelSotelo.backendargentinaprograma.model.Persona;
import com.MiguelSotelo.backendargentinaprograma.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {
    private final PersonaRepository personaRepo;
    @Autowired
    public PersonaService(PersonaRepository personaRepo) {

        this.personaRepo = personaRepo;
    }
    public Persona addPersona(Persona persona) {

        return personaRepo.save(persona);
    }

    public List<Persona> findAllPersonas() {

        return personaRepo.findAll();
    }

    public Persona updatePersona(Persona persona) {

        return personaRepo.save(persona);
    }

    public Persona findPersonaById(Long id) {
        return personaRepo.findPersonaById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deletePersona(Long id){

        personaRepo.deletePersonaById(id);
    }
}