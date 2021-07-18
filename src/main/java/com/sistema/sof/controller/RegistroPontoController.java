package com.sistema.sof.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sistema.sof.entity.Funcionario;
import com.sistema.sof.entity.Registro;
import com.sistema.sof.repository.RegistroPontoRepository;
import com.sistema.sof.services.RegistroPontoService;

@Controller
public class RegistroPontoController {

			
		@Autowired
		RegistroPontoService registroService;
		
		
		//CONSTRUTRO PADRAO DA CLASSE CONTROLLER
		public RegistroPontoController(){
		}

		//--------------------------------//

		@RequestMapping(method = RequestMethod.GET, value="/registrarPonto")
	    public String paginaInicial() {
	    	
	    	return "cadastro/formularioRegistrarPonto";
	    	
	    }
		
		
		//---------- INICIO DO METODO ADICIONAR REGISTROS AO BANCO
		@RequestMapping(value="/registrarPonto", method = RequestMethod.POST)
		public String adicionarRegistro( @ModelAttribute("registro") Registro registro ){
			
			
			registroService.salvarRegistroNoBanco( registro );
			

		    return "redirect:/";
		}	
	
   
}
