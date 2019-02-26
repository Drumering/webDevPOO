package br.com.opet.hospital;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
	protected String Nome;
	protected String DataNascimento;
	protected int Contato;
	protected int Cpf;
	protected String Email;

	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return Nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		Nome = nome;
	}

	/**
	 * @return the dataNascimento
	 */
	public String getDataNascimento() {
		return DataNascimento;
	}

	/**
	 * @param dataNascimento
	 *            the dataNascimento to set
	 */
	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}

	/**
	 * @return the contato
	 */
	public int getContato() {
		return Contato;
	}

	/**
	 * @param contato
	 *            the contato to set
	 */
	public void setContato(int contato) {
		Contato = contato;
	}

	/**
	 * @return the cpf
	 */
	public int getCpf() {
		return Cpf;
	}

	/**
	 * @param cpf
	 *            the cpf to set
	 */
	public void setCpf(int cpf) {
		Cpf = cpf;
	}

	/**
	 * @return the idade
	 * @throws ParseException
	 */
	public Date getIdade() throws ParseException {
		Date dtNasc = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		dtNasc = sdf.parse(DataNascimento);
		return dtNasc;
	}
}
