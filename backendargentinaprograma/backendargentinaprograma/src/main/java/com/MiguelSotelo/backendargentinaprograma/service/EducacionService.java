package com.MiguelSotelo.backendargentinaprograma.service;

import com.MiguelSotelo.backendargentinaprograma.exception.UserNotFoundException;
import com.MiguelSotelo.backendargentinaprograma.model.Educacion;
import com.MiguelSotelo.backendargentinaprograma.model.Persona;
import com.MiguelSotelo.backendargentinaprograma.repository.EducacionRepository;
import com.MiguelSotelo.backendargentinaprograma.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducacionService {

    private final EducacionRepository educacionRepo;
    @Autowired
    public EducacionService(EducacionRepository educacionRepo) {

        this.educacionRepo = educacionRepo;
    }
    public Educacion addEducacion(Educacion educacion) {

        return educacionRepo.save(educacion);
    }

    public List<Educacion> findAllEducacion() {

        return educacionRepo.findAll();
    }

    public Educacion updateEducacion(Educacion educacion) {

        return educacionRepo.save(educacion);
    }

    public Educacion findEducacionById(Long id) {
        return educacionRepo.findEducacionById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteEducacion(Long id){

        educacionRepo.deleteEducacionById(id);
    }
}
