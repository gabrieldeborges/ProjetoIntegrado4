package projeto_integrador4;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class PrincipalController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
}
