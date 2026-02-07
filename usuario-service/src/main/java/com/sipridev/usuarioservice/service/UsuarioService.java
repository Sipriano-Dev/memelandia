package com.sipridev.usuarioservice.service;


import com.sipridev.usuarioservice.domain.Usuario;
import com.sipridev.usuarioservice.repository.RepositorioUsuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final RepositorioUsuario repositorioUsuario;

    public UsuarioService(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    public Usuario criarUsuario(Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return repositorioUsuario.findAll();
    }

}
