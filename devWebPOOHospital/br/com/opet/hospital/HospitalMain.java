package br.com.opet.hospital;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.opet.util.Reader;

public class HospitalMain {
	Pessoa p[] = new Pessoa[10];
	
	public static void main(String[] args) throws ParseException {
		
	}

	public static void cadastrarMedico() throws Exception {
		Medico Medico = new Medico();
		System.out.println("Insira o nome do medico: ");
		Medico.setNome(Reader.readString());
		System.out.println("Insira Data de Nascimento: ");
		Medico.setDataNascimento(Reader.readString());
		System.out.println("Insira um numero para contato: ");
		Medico.setContato(Reader.readInt());
		System.out.println("Insira o CPF: ");
		Medico.setCpf(Reader.readInt());
		System.out.println("Insira Email:");
		Medico.setEmail(Reader.readString());
		System.out.println("Insira Especialidade: ");
		Medico.setEspecialidade(Reader.readString());
	}

}
