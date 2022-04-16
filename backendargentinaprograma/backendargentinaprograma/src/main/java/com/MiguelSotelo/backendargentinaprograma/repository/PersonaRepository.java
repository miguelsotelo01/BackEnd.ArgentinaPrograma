package com.MiguelSotelo.backendargentinaprograma.repository;

import com.MiguelSotelo.backendargentinaprograma.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

    void deletePersonaById(Long id);

    Optional <Persona>findPersonaById(Long id);
}
