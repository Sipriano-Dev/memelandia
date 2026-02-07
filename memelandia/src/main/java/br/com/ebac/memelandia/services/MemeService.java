package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.entities.Meme;
import br.com.ebac.memelandia.repositories.RepositorioMeme;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemeService {

    private final RepositorioMeme repositorioMeme;

    public MemeService(RepositorioMeme repositorioMeme) {
        this.repositorioMeme = repositorioMeme;
    }

    public Meme criarMeme(Meme meme) {
        return repositorioMeme.save(meme);
    }

    public List<Meme> listarMemes() {
        return repositorioMeme.findAll();
    }


}
