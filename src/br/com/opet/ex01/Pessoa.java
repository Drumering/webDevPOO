package br.com.opet.ex01;

public class Pessoa {
	// Atributos
	private int idade;
	private String profissao;

	// Construtor
	public Pessoa(int idade, String profissao) {
		this.idade = idade;
		this.profissao = profissao;
	}

	// Metodos
	boolean solicitarParada(Carro c) {
		boolean atendida = c.desacelera();
		if (atendida) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade
	 *            the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the profissao
	 */
	public String getProfissao() {
		return profissao;
	}

	/**
	 * @param profissao
	 *            the profissao to set
	 */
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
