package com.sistema.sof.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.sistema.sof.enums.TipoEnum;

@Entity
@Table(name = "registro")
public class Registro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "id")
	private Long id;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "dataAtual")
	private Date dataAtual;
	
	@DateTimeFormat(pattern = "HH:mm")
	@Column(name = "horaAtual")
	private Date horaAtual;
	
	@ElementCollection
	private List<Funcionario> funcionario;
	
	@Column(name = "tipo")
	private TipoEnum tipo;
	
	
	
	
	//INICIO DO CONSTRUTOR PADRAO DA CLASSE FUNCIONARIO
	public Registro() {
		
	}
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getHoraAtual() {
		return horaAtual;
	}

	public void setHoraAtual(Date horaAtual) {
		this.horaAtual = horaAtual;
	}

	public TipoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoEnum tipo) {
		this.tipo = tipo;
	}

	public Date getDataAtual() {
		return dataAtual;
	}

	public void setDataAtual(Date dataAtual) {
		this.dataAtual = dataAtual;
	}

	public Funcionario getFuncionario() {
		return (Funcionario) funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = (List<Funcionario>) funcionario;
	}

	
	@PrePersist
    public void prePersist() {
        final Date atual = new Date();
        dataAtual = atual;
        //dataAtualizacao = atual;
    }
}
