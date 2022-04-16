package com.MiguelSotelo.backendargentinaprograma.security.service;

import com.MiguelSotelo.backendargentinaprograma.security.entity.Usuario;
import com.MiguelSotelo.backendargentinaprograma.security.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<Usuario>getNombreUsuario(String nombreUsuario){
        return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    public boolean existsByNombreUsuario(String nombreUsuario){
        return usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    public boolean existsByEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }
    public void save(Usuario usuario ){
         usuarioRepository.save(usuario);
    }
}
