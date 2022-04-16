package com.MiguelSotelo.backendargentinaprograma.service;

import com.MiguelSotelo.backendargentinaprograma.exception.UserNotFoundException;
import com.MiguelSotelo.backendargentinaprograma.model.Habilidades;
import com.MiguelSotelo.backendargentinaprograma.repository.HabilidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabilidadesService {
    private final HabilidadesRepository habilidadesRepo;
    @Autowired
    public HabilidadesService(HabilidadesRepository habilidadesRepo) {

        this.habilidadesRepo = habilidadesRepo;
    }
    public Habilidades addHabilidades(Habilidades habilidades) {

        return habilidadesRepo.save(habilidades);
    }

    public List<Habilidades> findAllHabilidades() {

        return habilidadesRepo.findAll();
    }

    public Habilidades updateHabilidades(Habilidades habilidades) {

        return habilidadesRepo.save(habilidades);
    }

    public Habilidades findHabilidadesById(Long id) {
        return habilidadesRepo.findHabilidadesById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteHabilidades(Long id){

        habilidadesRepo.deleteHabilidadesById(id);
    }
}
