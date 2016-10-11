package rfm.com.br.agendae2.agendator.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import rfm.com.br.agendae2.agendator.model.Empresa;
import rfm.com.br.agendae2.agendator.model.Endereco;
import rfm.com.br.agendae2.agendator.repository.Enderecos;

@Controller
public class EmpresasController {
	
	@Autowired
	private Enderecos enderecos;
	
	
	@RequestMapping("/empresa/cadastro")
	public ModelAndView cadastro(Empresa empresa) {
		ModelAndView mv = new ModelAndView("empresa/CadastroEmpresa");
		mv.addObject("enderecos", enderecos.findAll());
		
		return mv;
	}
	
	@RequestMapping(value = "/empresa/cadastro", method = RequestMethod.POST)
	public ModelAndView cadastrar(@Valid Empresa empresa, BindingResult result, Model model,
			RedirectAttributes attributes) {
		/*
		 * if (result.hasErrors()) { return cadastro(endereco); }
		 */

		// Salvar no banco de dados...
		attributes.addFlashAttribute("mensagem", "Empresa salva com sucesso!");
		//System.out.println(">>> Logradouro: " + endereco.getLogradouro());
		return new ModelAndView("redirect:/empresa/cadastro");
	}
	
}
