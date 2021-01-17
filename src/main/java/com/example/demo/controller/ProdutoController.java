package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Categoria;
import com.example.demo.model.Cliente;
import com.example.demo.model.Produto;
import com.example.demo.repository.CategoriaRepository;
import com.example.demo.repository.ProdutoRepository;

@RestController // Classe que recebe requsições
public class ProdutoController {
		
    CategoriaRepository c;
	ProdutoRepository product;
	
	@SuppressWarnings("unchecked")
	@PostMapping("/postLancamento/{id}")
    public String postLancamento(@PathVariable(value = "id") Long Id, @RequestBody Produto produto) {
        try {
        	
        	 produto = new Produto();
        	 produto.setId(Id);
        	 product.save(produto);
        	 
        	 Categoria categoria = new Categoria();
        	 
        	 categoria.setProdutos(produto);
        	 
        	    c.save(categoria);
        	 
        	    return product.toString();
        
        
        } catch (Exception e) {
            return "Erro no método postLancamento(): " + e.getMessage();
        }
    }
    
       
    	
	
}
