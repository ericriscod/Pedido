package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	SimpleDateFormat sdfNascimento = new SimpleDateFormat ("dd/MM/yyyy");

	private String nome;
	private String email;
	private Date dataDeNascimento;

	public Cliente() {
	}

	public Cliente(String nome, String email, Date dataDeNascimento) {
		this.nome = nome;
		this.email = email;
		this.dataDeNascimento = dataDeNascimento;
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

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome + "(" + sdfNascimento.format(dataDeNascimento) + ") - " + email);
		return sb.toString();
	}
	
	

}
