package com.sistema.sof.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "funcionario") 
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
    @Column(name = "id")
    private Long id;
    
    @Column(name = "nome")
    private String nome;	
	
    @Column(name = "cpf")
    private String cpf;	
    
    @Column(name = "email")
    private String email;	   
 
    @Column(name = "telefone")
    private String telefone;    
	
    
	public Funcionario() {
	}

	//--------------------------------------------//
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}