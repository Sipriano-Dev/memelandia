package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.integration.usuario.UsuarioClient;
import org.springframework.stereotype.Service;
import br.com.ebac.memelandia.entities.Usuario;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioClient usuarioClient;

    public UsuarioService(UsuarioClient usuarioClient) {
        this.usuarioClient = usuarioClient;
    }

    public Usuario criarUsuario(Usuario usuario) {
        return usuarioClient.criarUsuario(usuario);
    }

    public List<Usuario> listarUsuarios() {
            return usuarioClient.listarUsuarios();
        }

}
