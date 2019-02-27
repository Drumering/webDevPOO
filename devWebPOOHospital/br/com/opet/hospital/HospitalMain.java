package br.com.opet.hospital;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.opet.util.Reader;

public class HospitalMain {	

	public static void main(String[] args) throws ParseException {
		Pessoa p[] = new Pessoa[10];
		Medico m[] = new Medico[10];
		
		int tam = 0;
		int opc = Menu();
		while(opc!=0) {
			switch (opc) {
			case 1:
				cadastrarMedico(m,tam);
				break;

			default:
				break;
			}
		}
		
	}
	
	public static int Menu() throws Exception {
		System.out.println("1 - Cadastrar Medico");
		System.out.println("2 - Cadastrar ADM");
		System.out.println("3 - Cadastrar Enfermeiro");
		
		int menu = Reader.readInt();
		return menu;
		
	}

	public static int cadastrarMedico(Medico m[], int tam) throws Exception {
		if (tam > 10) {
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
			m[tam] = Medico;
			tam++;

			System.out.println("Deseja cadastrar mais algum MEDICO?");
			System.out.println("0 - NAO");
			System.out.println("1 - SIM");
			int verificaCadastro = Reader.readInt();
			if (verificaCadastro == 0) {
				return tam;
			}
		} else {
			System.out.println("Lista Cheia");
		}
		return tam;
	}

}
