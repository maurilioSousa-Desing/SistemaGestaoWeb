package com.sistema.sof.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sistema.sof.entity.Registro;

@Repository
@Transactional
public interface RegistroPontoRepository extends JpaRepository<Registro, Long>{

}
