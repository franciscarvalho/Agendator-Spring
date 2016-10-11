package rfm.com.br.agendae2.agendator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuariosController {
	@RequestMapping("/usuario/cadastro")
	public String cadastro() {
		return "usuario/CadastroUsuario";
	}	
}
