package Entidades;

public class User {
	
	private Integer id;
    private Integer codInterno;
    private Integer codEstrangeiro;
    private String nome;
    private String email;
    private String telefone;
    private Integer idade;
    
    
	public User(Integer id, Integer codInterno, Integer codEstrangeiro, String nome, String email, String telefone, 
			Integer idade) {
		this.id = id;
		this.codInterno = codInterno;
		this.codEstrangeiro = codEstrangeiro;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.idade = idade;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getCodInterno() {
		return codInterno;
	}


	public void setCodInterno(Integer codInterno) {
		this.codInterno = codInterno;
	}


	public Integer getCodEstrangeiro() {
		return codEstrangeiro;
	}


	public void setCodEstrangeiro(Integer codEstrangeiro) {
		this.codEstrangeiro = codEstrangeiro;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}

    
}
