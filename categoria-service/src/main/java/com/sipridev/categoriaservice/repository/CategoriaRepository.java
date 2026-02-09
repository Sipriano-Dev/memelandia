package com.sipridev.categoriaservice.repository;

import com.sipridev.categoriaservice.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
