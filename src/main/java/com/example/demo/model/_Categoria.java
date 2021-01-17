package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="_Categoria")
public class _Categoria {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY) // Incrementa automaticamente
	 private long id;
	 
	 @Column(nullable = false) // Deixar campos nulos ou não
	 private String categoria;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	 
	
	
}
