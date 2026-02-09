package br.com.ebac.memelandia.integration.categoria;

import br.com.ebac.memelandia.entities.CategoriaMeme;
import br.com.ebac.memelandia.entities.Usuario;

public class CategoriaConverter {

    private CategoriaConverter() {
    }

    public static CategoriaRequest toRequest(CategoriaMeme categoria) {
        CategoriaRequest req = new CategoriaRequest();
        req.setNome(categoria.getNome());
        req.setDescricao(categoria.getDescricao());
        req.setDataCadastro(categoria.getDataCadastro());
        req.setUsuarioId(categoria.getUsuario().getId());
        return req;
    }

    public static CategoriaMeme toEntity(CategoriaResponse resp) {
        CategoriaMeme categoria = new CategoriaMeme();
        categoria.setId(resp.getId());
        categoria.setNome(resp.getNome());
        categoria.setDescricao(resp.getDescricao());
        categoria.setDataCadastro(resp.getDataCadastro());

        Usuario u = new Usuario();
        u.setId(resp.getUsuarioId());
        categoria.setUsuario(u);

        return categoria;
    }
}

