package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model._Produto;
import com.example.demo.repository._ProdutoRepository;

@RestController 
@RequestMapping("/Produtos") 
public class _ProdutoController {
	
	@Autowired
	private _ProdutoRepository prod;
	
	@GetMapping
	public List<_Produto> index() {	
		
	return prod.findAll();	
	
	}
	
	@GetMapping("/show/{id}")
	public Optional<_Produto> show(@PathVariable Long id) {
	return prod.findById(id);	
	} 

	@PutMapping("/{id}")
	public _Produto upd(@RequestBody _Produto p) {
	return prod.save(p);
	}
	
	@PostMapping
	public _Produto adicionar(@RequestBody _Produto produto) {
	 System.out.print(produto);	
	 return prod.save(produto);
	}
	
	@DeleteMapping("/{id}")
	 public HttpStatus deletePost(@PathVariable _Produto id) {
		try {
		
		prod.delete(id); 
		
		return HttpStatus.OK;
		
		}catch(Exception er) {
			
		return HttpStatus.BAD_REQUEST;
			
		}
		
        
    }
}
