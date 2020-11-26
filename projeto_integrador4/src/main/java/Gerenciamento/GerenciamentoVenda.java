package Gerenciamento;

import java.util.Date;
import java.util.List;

import Entidades.User;
import Entidades.Venda;

public class GerenciamentoVenda {

	private Sistema _sistema;
	public GerenciamentoVenda(Sistema sistema) {
        _sistema = sistema;
    }
	
	public Sistema vender() {
		
		Date agora = new Date();
		
		Integer id = 0;
		Date data = agora;
		String descricao = "";
		String local = "";
		String partida = "";
		User usuario = new User(0, 0, 0, "lucas", "lucas@gmail.com", "0", 20);
		
		Venda venda = new Venda(id, data, descricao, local, partida, usuario);
		
		_sistema.listVenda.add(venda);
		
		return _sistema;
	}
	
	public void mostrarVenda (List<Venda> listVenda) {
		
		for(Venda v : listVenda) {
			System.out.println(v.getId() + " " + v.getDescricao());
		}
	}
}
