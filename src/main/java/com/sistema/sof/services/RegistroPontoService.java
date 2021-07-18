package com.sistema.sof.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.sof.entity.Registro;
import com.sistema.sof.repository.RegistroPontoRepository;

@Service
public class RegistroPontoService {
	
private static final Logger log = LoggerFactory.getLogger( FuncionarioService.class );
	
	@Autowired
	private RegistroPontoRepository registroRepository;


	public RegistroPontoService() {
	}

	//-----------------------------//
	

	public List<Registro> pegarTodosOsRegistros(){
		
		
		List<Registro> listaDeRegistros = new ArrayList<Registro>();
		
		
		listaDeRegistros = registroRepository.findAll();
		
		return listaDeRegistros;

	}

	//----
	
	
	public void salvarRegistroNoBanco( Registro registro ){
		
		registroRepository.save( registro );
		
	}

	//----
	
	public void deletarRegistro(Long id) {
		
		registroRepository.deleteById(id);
		
	}

	//----
	
	public Registro buscarRegistroPeloId( Long id) {
		
		Registro registro = new Registro();
		
		try {
			
			registro = registroRepository.findById(id).get();
			
		}catch(Exception e){
			
			log.info("Funcionario nao encontrado'");
			
			return null;
			
		}

		return registro;
	}
	
	//----
}
