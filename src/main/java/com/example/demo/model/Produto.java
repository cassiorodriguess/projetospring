package com.example.demo.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="produto")
public class Produto {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY) // Incrementa automaticamente
	 private long id;
	 
	 @Column(nullable = false) // Deixar campos nulos ou não
	 private String titulo;
	 
	 @Column(nullable = false) // Deixar campos nulos ou não
	 private String descricao;
	 
	 @Column(nullable = false) // Deixar campos nulos ou não
	 private Double preco;

	 @Column(nullable = false) // Deixar campos nulos ou não
	 private Integer quantidade;
	 
	 @ManyToOne
	 
	 private Categoria categoria;
	 
	 public Produto() { }
	 
	 public Produto(String titulo, String descricao,Double preco,Integer quantidade) {
		
	 this.titulo = titulo;
	 this.descricao = descricao;
	 this.quantidade = quantidade;
	 this.preco = preco;
		 
	 }
	 

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Object cate) {
		this.categoria = (Categoria) cate;
	}

	
}
