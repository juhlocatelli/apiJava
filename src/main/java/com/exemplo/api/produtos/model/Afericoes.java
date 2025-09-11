package com.exemplo.api.produtos.model; 

 import jakarta.persistence. Entity;
 import jakarta.persistence.GeneratedValue;
 import jakarta.persistence.GenerationType;
 import jakarta.persistence. Id;
 @Entity
 public class Afericoes {
@Id
@GeneratedValue(strategy = GenerationType. IDENTITY) 
private Long id; 
private String nome;
private Double valor;
public Afericoes() {}

 public Afericoes(String nome, Double valor) {
 this.nome = nome;

this.valor = valor;
 }

 // Getters e Setters
 public Long getId() { return id; }
 public void setId(Long id) { this.id = id; }
 public String getNome() { return nome; }
 public void setNome (String nome) { this.nome = nome; }
 public Double getPreco() { return valor; }
 public void setPreco (Double valor) { this.valor = valor; }

 }