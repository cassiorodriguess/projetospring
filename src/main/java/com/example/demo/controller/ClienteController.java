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

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;

@RestController // Classe que recebe requsições
@RequestMapping("/Client") //Receber requisições com /Clientes
public class ClienteController {
	
	@Autowired // Injeta uma instancia de cliente repository
	private ClienteRepository clienteRepository;
	
	// Quando chegar uma requisição usando Http GET.
	@GetMapping
	public List<Cliente> index() {
		return clienteRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED) // Retorna status criado (201)
	public Cliente adicionar(@RequestBody Cliente cliente) {
	
		return clienteRepository.save(cliente);
	}

}
