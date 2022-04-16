package com.MiguelSotelo.backendargentinaprograma.security.service;

import com.MiguelSotelo.backendargentinaprograma.security.entity.Rol;
import com.MiguelSotelo.backendargentinaprograma.security.enums.RolNombre;
import com.MiguelSotelo.backendargentinaprograma.security.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository rolRepository;

    public Optional<Rol>getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

}
