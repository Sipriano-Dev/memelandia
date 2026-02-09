package com.sipridev.usuarioservice.controller;

import com.sipridev.usuarioservice.domain.Usuario;
import com.sipridev.usuarioservice.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    @GetMapping()
    public List<Usuario> buscaUsuarios() {
        return usuarioService.listarUsuarios();
    }

    @PostMapping()
    public Usuario novoUsuario(@RequestBody Usuario usuario) {
        return usuarioService.criarUsuario(usuario);
    }


}
