package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.integration.categoria.CategoriaClient;
import br.com.ebac.memelandia.integration.categoria.CategoriaConverter;
import br.com.ebac.memelandia.integration.categoria.CategoriaRequest;
import br.com.ebac.memelandia.entities.CategoriaMeme;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CategoriaMemeService {

    private final CategoriaClient categoriaClient;

    public CategoriaMemeService(CategoriaClient categoriaClient) {
        this.categoriaClient = categoriaClient;
    }


    public CategoriaMeme criarCategoria(CategoriaMeme categoriaMeme) {
        return CategoriaConverter.toEntity(categoriaClient.criarCategoria(CategoriaConverter.toRequest(categoriaMeme))) ;
    }

    public List<CategoriaMeme> listarCategoria() {
        return categoriaClient.listarCategoria().stream().map(CategoriaConverter::toEntity).toList();
    }


}
