package com.MiguelSotelo.backendargentinaprograma.repository;

import com.MiguelSotelo.backendargentinaprograma.model.Educacion;
import com.MiguelSotelo.backendargentinaprograma.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EducacionRepository extends JpaRepository<Educacion, Long> {
    void deleteEducacionById(Long id);
    Optional<Educacion> findEducacionById(Long id);
}
