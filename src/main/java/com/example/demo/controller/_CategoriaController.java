package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;
import com.example.demo.model._Categoria;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository._CategoriaRepository;

@RestController // Classe que recebe requsições
@RequestMapping("/Categorias") //Receber requisições com /Clientes
public class _CategoriaController {
	
	@Autowired // Injeta uma instancia de cliente repository
	private _CategoriaRepository cate;
	
	@GetMapping
	public List<_Categoria> index() {	
		
	return cate.findAll();	
	
	}
	
	@PostMapping
	public _Categoria adicionar(@RequestBody _Categoria categoria) {
			return cate.save(categoria);
	}

}
