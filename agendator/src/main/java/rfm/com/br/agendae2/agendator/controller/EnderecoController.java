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
import rfm.com.br.agendae2.agendator.model.Endereco;
import rfm.com.br.agendae2.agendator.repository.Empresas;

@Controller
public class EnderecoController {

	@Autowired
	private Empresas empresas;
	
	
	
	@RequestMapping("/endereco/cadastro")
	public ModelAndView cadastro(Endereco endereco) {
		ModelAndView mv = new ModelAndView("endereco/CadastroEndereco");
		mv.addObject("empresas", empresas.findAll());
		return mv;
	}

	@RequestMapping(value = "/endereco/cadastro", method = RequestMethod.POST)
	public ModelAndView cadastrar(@Valid Endereco endereco, BindingResult result, Model model,
			RedirectAttributes attributes) {
		/*
		 * if (result.hasErrors()) { return cadastro(endereco); }
		 */

		// Salvar no banco de dados...
		attributes.addFlashAttribute("mensagem", "Endereço salvo com sucesso!");
		//System.out.println(">>> Logradouro: " + endereco.getLogradouro());
		return new ModelAndView("redirect:/endereco/cadastro");
	}
}
