package com.MiguelSotelo.backendargentinaprograma.security.service;

import com.MiguelSotelo.backendargentinaprograma.security.entity.Usuario;
import com.MiguelSotelo.backendargentinaprograma.security.entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UsuarioService usuarioService;
    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario= usuarioService.getNombreUsuario(nombreUsuario).get();
        return UsuarioPrincipal.build(usuario);
    }
}
