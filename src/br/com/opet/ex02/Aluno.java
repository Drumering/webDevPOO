package br.com.opet.ex02;

public class Aluno {
	String nome;
	int idade;
	String email;
	String curso;

	boolean estudar() {
		return true;
	}

	boolean validaIdade(int idade) {
		if (idade < 0 || idade > 150) {
			return true;
		}
		return false;
	}
	
	void validaEmail(String email) {
		if(email.contains("@")) {
			System.out.println("Email validado");
		}else {
			System.out.println("Email invalido");
			return;
		}
	}
	
	void validaCurso(String curso) {
		System.out.println("Verificar curso disponivel");
	}

}
