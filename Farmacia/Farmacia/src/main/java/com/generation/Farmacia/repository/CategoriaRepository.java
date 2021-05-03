package com.generation.Farmacia.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.Farmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria>findAllByDescricaoContainingIgnoreCase(String descricao);

}
