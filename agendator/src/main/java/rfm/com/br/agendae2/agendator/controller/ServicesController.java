package rfm.com.br.agendae2.agendator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServicesController {
	
	@RequestMapping("/servicos/novo")
	public String novo() {
		return "servicos/CadastroServicos";
	}
	
	@RequestMapping("/servicos/cadastro")
	public String cadastro() {
		return "servicos/CadastroServicos";
	}
}
