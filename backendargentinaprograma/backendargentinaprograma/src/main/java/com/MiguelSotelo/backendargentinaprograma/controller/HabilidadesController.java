package com.MiguelSotelo.backendargentinaprograma.controller;

import com.MiguelSotelo.backendargentinaprograma.model.Habilidades;
import com.MiguelSotelo.backendargentinaprograma.service.HabilidadesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Transactional
@CrossOrigin
@RestController
@RequestMapping("/habilidades")
public class HabilidadesController {
    private final HabilidadesService habilidadesService;

    public HabilidadesController(HabilidadesService habilidadesService) {
        this.habilidadesService = habilidadesService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Habilidades>> getAllHabilidades(){
        List<Habilidades> habilidades=habilidadesService.findAllHabilidades();
        return new ResponseEntity<>(habilidades, HttpStatus.OK);

    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Habilidades>getHabilidadesById(@PathVariable("id")Long id){
        Habilidades habilidades=habilidadesService.findHabilidadesById(id);
        return new ResponseEntity<>(habilidades, HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public ResponseEntity<Habilidades>addHabilidades(@RequestBody Habilidades habilidades){
        Habilidades newHabilidades=habilidadesService.addHabilidades(habilidades);
        return new ResponseEntity<>(habilidades, HttpStatus.CREATED);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public ResponseEntity<Habilidades> updateHabilidades (@RequestBody Habilidades habilidades) {
        Habilidades updateHabilidades = habilidadesService.updateHabilidades(habilidades);
        return new ResponseEntity<>(updateHabilidades, HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>deleteHabilidades(@PathVariable ("id") Long id){
        habilidadesService.deleteHabilidades(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
