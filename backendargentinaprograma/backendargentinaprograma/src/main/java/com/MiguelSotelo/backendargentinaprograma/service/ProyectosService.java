package com.MiguelSotelo.backendargentinaprograma.service;

import com.MiguelSotelo.backendargentinaprograma.exception.UserNotFoundException;
import com.MiguelSotelo.backendargentinaprograma.model.Persona;
import com.MiguelSotelo.backendargentinaprograma.model.Proyectos;
import com.MiguelSotelo.backendargentinaprograma.repository.PersonaRepository;
import com.MiguelSotelo.backendargentinaprograma.repository.ProyectosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectosService {
    private final ProyectosRepository proyectosRepo;
    @Autowired
    public ProyectosService(ProyectosRepository proyectosRepo) {

        this.proyectosRepo = proyectosRepo;
    }
    public Proyectos addProyectos(Proyectos proyectos) {

        return proyectosRepo.save(proyectos);
    }

    public List<Proyectos> findAllProyectos() {

        return proyectosRepo.findAll();
    }

    public Proyectos updateProyectos(Proyectos proyectos) {

        return proyectosRepo.save(proyectos);
    }

    public Proyectos findProyectosById(Long id) {
        return proyectosRepo.findProyectosById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteProyectos(Long id){

        proyectosRepo.deleteProyectosById(id);
    }
}
