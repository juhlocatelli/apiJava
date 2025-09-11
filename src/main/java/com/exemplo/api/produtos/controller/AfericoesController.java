package com.exemplo.api.produtos.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.exemplo.api.produtos.model.Afericoes;
import com.exemplo.api.produtos.repository.AfericoesRepository;

@RestController
@RequestMapping("/afericoes")
public class AfericoesController {
    private final AfericoesRepository repository;

    public AfericoesController(AfericoesRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Afericoes criar(@RequestBody Afericoes produto) {
        return repository.save(produto);
    }

    @GetMapping
    public List<Afericoes> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Afericoes buscar(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Afericoes atualizar(@PathVariable Long id, @RequestBody Afericoes novoProduto) {
        return repository.findById(id).map(produto -> {
            produto.setNome(novoProduto.getNome());
            produto.setPreco(novoProduto.getPreco());
            return repository.save(produto);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}