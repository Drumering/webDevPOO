package br.com.opet.ex01;

import java.util.Random;

public class Carro extends Veiculo{
	//Atributos
	private String modelo;
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	//Metodos
	boolean desacelera() {		
		Random rdn = new Random();
		int atendida = rdn.nextInt(2);
		if(atendida == 0) {
			System.out.println("Calmaew tio!");
			return true;
		}else {
			System.out.println("Se fodeu, flws!");
			return false;
		}		
	}
}
