package br.com.opet.hospital;

public class Medico extends Pessoa{
	protected String Especialidade;

	/**
	 * @return the especialidade
	 */
	public String getEspecialidade() {
		return Especialidade;
	}

	/**
	 * @param especialidade the especialidade to set
	 */
	public void setEspecialidade(String especialidade) {
		Especialidade = especialidade;
	}
}
