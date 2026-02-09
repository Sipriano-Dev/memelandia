package br.com.ebac.memelandia.integration.categoria;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoriaClient {

    private final RestTemplate restTemplate;

    public CategoriaClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<CategoriaResponse> listarCategoria() {
        CategoriaResponse[] categoriasResponse = restTemplate.getForObject(
                "http://localhost:8082/categorias",
                CategoriaResponse[].class
        );
        return Arrays.asList(categoriasResponse);
    }

    public CategoriaResponse criarCategoria(CategoriaRequest request) {
        return restTemplate.postForObject(
                "http://localhost:8082/categorias",
                request,
                CategoriaResponse.class
        );
    }
}
