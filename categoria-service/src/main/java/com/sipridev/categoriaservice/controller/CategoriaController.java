package com.sipridev.categoriaservice.controller;

import com.sipridev.categoriaservice.model.Categoria;
import com.sipridev.categoriaservice.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }


    @GetMapping()
    public List<Categoria> buscaCategorias() {
        return categoriaService.listarCategorias();
    }

    @PostMapping()
    public Categoria criarCategoria(@RequestBody Categoria categoria) {
        return categoriaService.criarCategoria(categoria);
    }

}
