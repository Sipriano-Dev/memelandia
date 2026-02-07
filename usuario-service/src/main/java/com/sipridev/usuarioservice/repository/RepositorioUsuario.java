package com.sipridev.usuarioservice.repository;

import com.sipridev.usuarioservice.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
}
