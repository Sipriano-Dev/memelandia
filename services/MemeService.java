package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.entities.Meme;
import br.com.ebac.memelandia.repositories.RepositorioCategoriaMeme;
import br.com.ebac.memelandia.repositories.RepositorioMeme;
import br.com.ebac.memelandia.repositories.RepositorioUsuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemeService {

    private final RepositorioUsuario repositorioUsuario;
    private final RepositorioCategoriaMeme categoriaMeme;
    private final RepositorioMeme repositorioMeme;

    public MemeService(RepositorioUsuario repositorioUsuario, RepositorioCategoriaMeme categoriaMeme, RepositorioMeme repositorioMeme) {
        this.repositorioUsuario = repositorioUsuario;
        this.categoriaMeme = categoriaMeme;
        this.repositorioMeme = repositorioMeme;
    }

    public Meme criarMeme(Meme meme) {
        return repositorioMeme.save(meme);
    }

    public List<Meme> listarMemes() {
        return repositorioMeme.findAll();
    }


}
