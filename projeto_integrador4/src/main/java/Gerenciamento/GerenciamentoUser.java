package Gerenciamento;

import java.util.List;
import java.util.Random;

import Entidades.User;
import Entidades.Venda;

public class GerenciamentoUser {

	private Sistema _sistema;

	public GerenciamentoUser(Sistema sistema) {
		_sistema = sistema;
	}

	public Sistema adicionarUsuario() {

		int id = 0;
		int codInterno = 0;
		int codEstrangeiro = 0;
		String nome = "";
		String email = "";
		String telefone = "";
		int idade = 0;

		User usuario = new User(id, codInterno, codEstrangeiro, nome, email, telefone, idade);

		_sistema.listUser.add(usuario);
		return _sistema;
	}

	public void mostrarUser(List<User> listUser) {

		for (User v : listUser) {
			System.out.println(v.getNome() + " " + v.getEmail());
		}
	}

	public Sistema excluirUser() {

		int id = 0;
		User userResult = null;
		for (int i = 0; i < _sistema.listUser.size(); i++) {

			userResult = _sistema.listUser.get(i);

			if (userResult.getId().equals(id)) {
				_sistema.listUser.remove(id);
				System.out.println("\nUser Excluido");
			}
		}
		return _sistema;
	}
	
	
	
}