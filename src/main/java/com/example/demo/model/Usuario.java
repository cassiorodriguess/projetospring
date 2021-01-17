//package com.example.demo.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//import org.dom4j.tree.AbstractEntity;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//@Entity
//public class Usuario extends AbstractEntity {
//
//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // Incrementa automaticamente
//	private long id;
//	
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	@Column(unique = true)
//	private String username;
//	
//	@JsonIgnore	
//	private String password;
//	
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public boolean isAdmin() {
//		return admin;
//	}
//
//	public void setAdmin(boolean admin) {
//		this.admin = admin;
//	}
//
//	private String name;
//
//	private boolean admin;
//	
//	
//	
//}
