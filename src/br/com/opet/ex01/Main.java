package br.com.opet.ex01;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa(66,"Tira");
		Carro c = new Carro(1966,"Mini");
				
		boolean atendida = p.solicitarParada(c);
		
		if(atendida == true) {
			System.out.println("Parada completa...");
		}else {			
			System.out.println("Inicia perseguicao...");
		}
	}

}
