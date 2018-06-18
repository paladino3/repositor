package br.com.paladino.modelo.entidade;

public class Dentista {

	private String id;
	private String cro;
	private String nome;
	private String rg;
	private String cpf;

	private Endereco endereco;
	private Contato contato;
	
	
	
	public Dentista(String id, String cro, String nome, String rg, String cpf) {
		super();
		this.id = id;
		this.cro = cro;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
	}


	public Dentista(String cro, String nome, String rg, String cpf) {
		super();
		this.cro = cro;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
	}


	public Dentista() {
		super();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((cro == null) ? 0 : cro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dentista other = (Dentista) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (cro == null) {
			if (other.cro != null)
				return false;
		} else if (!cro.equals(other.cro))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		return true;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dentista [id=").append(id).append(", cro=").append(cro).append(", nome=").append(nome)
				.append(", rg=").append(rg).append(", cpf=").append(cpf).append(", endereco=").append(endereco)
				.append(", contato=").append(contato).append("]");
		return builder.toString();
	}
		
}
