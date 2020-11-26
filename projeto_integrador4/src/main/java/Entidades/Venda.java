package Entidades;

import java.util.Date;

public class Venda {
	
	private Integer id;
	private Date data;
	private String descricao;
	private String local;
	private String partida;
	private User usuario;
	
	
	public Venda(Integer id, Date data, String descricao, String local, String partida, User usuario) {
		super();
		this.id = id;
		this.data = data;
		this.descricao = descricao;
		this.local = local;
		this.partida = partida;
		this.usuario = usuario;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}


	public String getPartida() {
		return partida;
	}


	public void setPartida(String partida) {
		this.partida = partida;
	}


	public User getUsuario() {
		return usuario;
	}


	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}

}
