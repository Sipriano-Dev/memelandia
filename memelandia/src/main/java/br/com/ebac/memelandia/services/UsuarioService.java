package br.com.ebac.memelandia.services;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import br.com.ebac.memelandia.entities.Usuario;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UsuarioService {

    private final RestTemplate restTemplate;

    public UsuarioService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Usuario criarUsuario(Usuario usuario) {
        return restTemplate.postForObject(
                "http://localhost:8081/memelandia/usuarios",
                usuario,
                Usuario.class
        );
    }

    public List<Usuario> listarUsuarios() {
        Usuario[] usuarios = restTemplate.getForObject(
                "http://localhost:8081/memelandia/usuarios",
                Usuario[].class
        );
        return Arrays.asList(usuarios);

        }

}
