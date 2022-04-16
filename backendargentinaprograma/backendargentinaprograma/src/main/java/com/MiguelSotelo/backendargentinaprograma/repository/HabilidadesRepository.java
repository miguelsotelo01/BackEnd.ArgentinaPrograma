package com.MiguelSotelo.backendargentinaprograma.repository;

import com.MiguelSotelo.backendargentinaprograma.model.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HabilidadesRepository extends JpaRepository<Habilidades,Long> {
    void deleteHabilidadesById(Long id);
        Optional<Habilidades>findHabilidadesById(Long id);
}
