package com.sistema.sof.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sistema.sof.entity.Funcionario;

import com.sistema.sof.services.FuncionarioService;



/**
 * 
 * @author Francisco
 *
 */

@Controller
public class FuncionarioController {
	
	@Autowired
	FuncionarioService funcionarioService;
	
	
	
	
	
	public FuncionarioController(){
	}

	//--------------------------------//

	@RequestMapping("/")
	public String exibirPaginaInicial( Model model ){

		
		List<Funcionario> listaDeFuncionarios = funcionarioService.pegarTodosOsFuncionarios();
		
		//model é um objeto fornecido pelo proprio spring.
		model.addAttribute("listaDeFuncionarios", listaDeFuncionarios);


		return "inicio";
	}	
	
	
	
	//---- METODO EXIBIR FORMULARIO DE CADASTRO ----
	@RequestMapping(value="/exibirFormularioAdicionar")
	public String exibirFormularioAdicionar( Model model ){
		
		Funcionario funcionario = new Funcionario();
		
		model.addAttribute("funcionario", funcionario);
		
	    return "formularioAdicionarFuncionario";
	}	
	
	
	
	
	
	@RequestMapping(value="/adicionarFuncionario", method = RequestMethod.POST)
	public String adicionarFuncionario( @ModelAttribute("funcionario") Funcionario funcionario ){
		
		
		funcionarioService.salvarFuncionarioNoBanco( funcionario );
		

	    return "redirect:/";
	}	
	
	//metodo Deletar um Funcionario
	
	@RequestMapping("/deletarFuncionario/{id}")
	public String deletarFuncionario ( @PathVariable(name = "id") Long id ){

		funcionarioService.deletarFuncionario(id);
	     
	  //Redirecionar para a pagina index.
	    return "redirect:/";
	}	
	
	
	@RequestMapping(value="/exibirFormularioEditar/{id}")
	public ModelAndView exibirFormularioEditar( @PathVariable(name = "id") Long id ){
		
		
		Funcionario funcionario = funcionarioService.buscarFuncionarioPeloId( id );
		
	    ModelAndView mv = new ModelAndView("formularioEditarFuncionario");	

	    mv.addObject( "funcionario", funcionario );
	    
	    return mv;
	}	
	
	
	
	
	
	
	
	// REgistro de Ponto
	
}