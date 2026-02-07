package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.entities.CategoriaMeme;
import br.com.ebac.memelandia.repositories.RepositorioCategoriaMeme;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaMemeService {

    private final RepositorioCategoriaMeme repositorioCategoriaMeme;

    public CategoriaMemeService(RepositorioCategoriaMeme repositorioCategoriaMeme) {
        this.repositorioCategoriaMeme = repositorioCategoriaMeme;
    }

    public CategoriaMeme criarCategoria(CategoriaMeme categoriaMeme) {
        return repositorioCategoriaMeme.save(categoriaMeme);
    }

    public List<CategoriaMeme> listarCategoria() {
        return repositorioCategoriaMeme.findAll();
    }


}
