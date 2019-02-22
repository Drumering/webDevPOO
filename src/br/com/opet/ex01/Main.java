package br.com.opet.ex01;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		Carro c = new Carro();
		
		p.setIdade(66);
		p.setProfissao("Tira");
		
		c.setAno(1966);
		c.setModelo("Mini");
		
		boolean atendida = p.solicitarParada(c);
		
		if(atendida == true) {
			System.out.println("Parada completa...");
		}else {			
			System.out.println("Inicia perseguicao...");
		}
	}

}
