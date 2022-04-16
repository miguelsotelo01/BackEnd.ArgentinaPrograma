package com.MiguelSotelo.backendargentinaprograma.controller;

import com.MiguelSotelo.backendargentinaprograma.model.Educacion;
import com.MiguelSotelo.backendargentinaprograma.service.EducacionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Transactional
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/educacion")
public class EducacionController {
    private final EducacionService educacionService;

    public EducacionController(EducacionService educacionService) {

        this.educacionService = educacionService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Educacion>> getAllEducacion(){
        List<Educacion> educacion=educacionService.findAllEducacion();
        return new ResponseEntity<>(educacion, HttpStatus.OK);

    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Educacion>getEducacionById(@PathVariable("id")Long id){
        Educacion educacion=educacionService.findEducacionById(id);
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public ResponseEntity<Educacion>addEducacion(@RequestBody Educacion educacion){
        Educacion newEducacion=educacionService.addEducacion(educacion);
        return new ResponseEntity<>(newEducacion, HttpStatus.CREATED);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public ResponseEntity<Educacion> updateEducacion (@RequestBody Educacion educacion) {
        Educacion updateEducacion = educacionService.updateEducacion(educacion);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>deleteEducacion(@PathVariable ("id") Long id){
        educacionService.deleteEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
