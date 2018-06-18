package br.com.paladino.modelo.entidade;

public class Endereco {


	private String cidade;
	private String endereco;
	private String cep;
	private String rua;
	private String numero;
	
	
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Endereco [cidade=")
		.append(cidade)
		.append(", endereco=")
		.append(endereco)
		.append(", cep=")
		.append(cep)
		.append(", rua=")
		.append(rua)
		.append(", numero=")
		.append(numero)
		.append("]");
		return builder.toString();
	}
	
	
}
