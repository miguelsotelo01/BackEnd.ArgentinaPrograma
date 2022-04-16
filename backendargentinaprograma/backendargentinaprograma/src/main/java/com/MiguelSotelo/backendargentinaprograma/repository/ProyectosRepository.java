package com.MiguelSotelo.backendargentinaprograma.repository;

import com.MiguelSotelo.backendargentinaprograma.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProyectosRepository extends JpaRepository<Proyectos,Long> {
    void deleteProyectosById(Long id);
    Optional<Proyectos>findProyectosById(Long id);
}
