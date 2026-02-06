package br.com.ebac.memelandia.services;

import org.springframework.stereotype.Service;
import br.com.ebac.memelandia.entities.Usuario;
import br.com.ebac.memelandia.repositories.RepositorioUsuario;

import java.util.List;
import java.util.Optional;

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

    public Optional<Usuario> buscarPorId(Long id) {
        return repositorioUsuario.findById(id);
    }
}
