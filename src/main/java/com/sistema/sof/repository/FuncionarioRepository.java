package com.sistema.sof.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.sof.entity.Funcionario;

/**
 * 
 * @author Francisco
 *
 */

@Transactional
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

	
}
