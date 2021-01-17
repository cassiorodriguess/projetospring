package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model._Produto;
@Repository
public interface _ProdutoRepository extends JpaRepository<_Produto, Long>{

}
