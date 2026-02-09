package br.com.ebac.memelandia.integration.usuario;

import br.com.ebac.memelandia.entities.Usuario;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class UsuarioClient {

    private final RestTemplate restTemplate;

    public UsuarioClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Usuario criarUsuario(Usuario usuario) {
        return restTemplate.postForObject(
                "http://localhost:8081/usuarios",
                usuario,
                Usuario.class
        );
    }

    public List<Usuario> listarUsuarios() {
        Usuario[] usuarios = restTemplate.getForObject(
                "http://localhost:8081/usuarios",
                Usuario[].class
        );
        return Arrays.asList(usuarios);
    }

}
