package br.com.opet.ex01;

public class Veiculo {
	protected int ano;

	public int getAno() {
		return ano;
	}
	
	protected void calculaPotencia() {
		System.out.println("Potencia estimada");
	}
	
	public void funcX() {
		System.out.println("Estou na classe veiculo");
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
