package com.exemplo.api.produtos.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.api.produtos.model.Afericoes;

public interface AfericoesRepository extends JpaRepository<Afericoes, Long> {
    List<Afericoes> findByNome(String nome);
    List<Afericoes> findByNomeContaining(String parteDoNome);
}
