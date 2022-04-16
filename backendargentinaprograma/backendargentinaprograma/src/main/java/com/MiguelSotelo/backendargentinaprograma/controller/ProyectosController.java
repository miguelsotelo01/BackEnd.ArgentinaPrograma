package com.MiguelSotelo.backendargentinaprograma.controller;

import com.MiguelSotelo.backendargentinaprograma.model.Proyectos;
import com.MiguelSotelo.backendargentinaprograma.service.ProyectosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Transactional
@CrossOrigin
@RestController
@RequestMapping("/proyectos")
public class ProyectosController {
    public final ProyectosService proyectosService;
    public ProyectosController(ProyectosService proyectosService) {

        this.proyectosService = proyectosService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Proyectos>> getAllProyectos() {
        List<Proyectos> proyectos = proyectosService.findAllProyectos();
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Proyectos>getProyectosById(@PathVariable("id")Long id){
        Proyectos proyectos=proyectosService.findProyectosById(id);
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }
    /**@PreAuthorize("hasRole('ADMIN')")**/
    @PostMapping("/add")
    public ResponseEntity<Proyectos>addProyectos(@RequestBody Proyectos proyectos){
        Proyectos newProyectos=proyectosService.addProyectos(proyectos);
        return new ResponseEntity<>(proyectos, HttpStatus.CREATED);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public ResponseEntity<Proyectos> updateProyectos (@RequestBody Proyectos proyectos) {
        Proyectos updateProyectos = proyectosService.updateProyectos(proyectos);
        return new ResponseEntity<>(updateProyectos, HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>deleteProyectos(@PathVariable ("id") Long id){
        proyectosService.deleteProyectos(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
