package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.entities.CategoriaMeme;
import br.com.ebac.memelandia.entities.Meme;
import br.com.ebac.memelandia.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicoMemelandia {
    @Autowired
    private MemeService memeService;

    @Autowired
    private CategoriaMemeService categoriaMemeService;

    @Autowired
    private UsuarioService usuarioService;


    public Usuario novoUsuario(Usuario usuario) {
        return usuarioService.criarUsuario(usuario);
    }

    public List<Usuario> listaTodosUsuarios() {
        return usuarioService.listarUsuarios();
    }

    public Meme novoMeme(Meme meme) {
        return memeService.criarMeme(meme);
    }

    public List<Meme> listaTodosMemes() {
        return memeService.listarMemes();
    }

    public CategoriaMeme novaCategoriaMeme(CategoriaMeme categoriaMeme) {
        return categoriaMemeService.criarCategoria(categoriaMeme);
    }

    public List<CategoriaMeme> listaTodasCategorias() {
        return categoriaMemeService.listarCategoria();
    }
}
