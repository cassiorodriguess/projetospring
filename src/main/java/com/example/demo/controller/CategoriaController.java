package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Categoria;
import com.example.demo.repository.CategoriaRepository;


@RestController
@RequestMapping("/Categoriarelacao") 
public class CategoriaController<S> {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	
	@GetMapping
	public List<Categoria> index() {
		return categoriaRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Categoria adicionar(@RequestBody Categoria categoria) {
	categoriaRepository.save(categoria);
	return categoria;
	}

}
