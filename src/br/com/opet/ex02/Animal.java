package br.com.opet.ex02;

public class Animal {
	int tempCorporal;
	String tipoReproducao;
	String alimentacao;

	void detalhaCaracteristicas(int tempCorporal, String tipoReproducao, String alimentacao) {
		System.out.println("Temperatura corporal " + tempCorporal + "°");
		System.out.println("Tipo Reproducao " + tipoReproducao);
		System.out.println("Alimentacao " + alimentacao);
	}
}
