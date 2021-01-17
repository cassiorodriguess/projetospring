package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categoria")
public class Categoria {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY) // Incrementa automaticamente
 private long id;
 private String categoria;
 
 @OneToMany
 private List<Produto> produto;
 
 public Categoria() {
	 
 }
 
 public Categoria(String categoria) {
 this.categoria = categoria;	 
 }
 
 
 public long getId() {
	return id;
 }
 
 public void setId(long id) {
		this.id = id;
 }

public String getCategoria() {
	return categoria;
}

public void setNome(String categoria) {
	this.categoria = categoria;
}
 
public List <Produto> getProdutos() {
    return produto;
}

public void setProdutos(Produto produto2) {
    this.produto = (List<Produto>) produto2;
}
 
 
}
