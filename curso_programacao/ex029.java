package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.ex029Hotel;


public class ex029 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("A dona de um pensionato possui dez quartos para alugar para estudantes,\r\n"
				+ "sendo esses quartos identificados pelos números 0 a 9.\r\n"
				+ "Fazer um programa que inicie com todos os dez quartos vazios, e depois\r\n"
				+ "leia uma quantidade N representando o número de estudantes que vão\r\n"
				+ "alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos\r\n"
				+ "N estudantes. Para cada registro de aluguel, informar o nome e email do\r\n"
				+ "estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha\r\n"
				+ "que seja escolhido um quarto vago. Ao final, seu programa deve imprimir\r\n"
				+ "um relatório de todas ocupações do pensionato, por ordem de quarto,\r\n"
				+ "conforme exemplo.");
		
		System.out.println("Digite a quantidade de registros");
		int n = sc.nextInt();
		ex029Hotel[] vect = new ex029Hotel[10];
		
		for (int i= 0; i <n; i++) {
			sc.nextLine();
			System.out.println("digite o nome do cliente");
			String nome = sc.nextLine();
			System.out.println("digite email:");
			String email = sc.nextLine();
			System.out.println("digite numero do quarto");
			int quarto = sc.nextInt();
			if(quarto >0 && quarto <11) {
				System.out.println("cliente regtistrado com sucesso!");
				
			}
			else {
				while(quarto <=0 || quarto >=11) {
				System.out.println("quantos entre 1 e 10");
				System.out.println("digite numero do quarto");
				quarto = sc.nextInt();
				}
			}
			
			vect[(quarto - 1)] = new ex029Hotel(nome,email, quarto);
			
		}
		
		
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				
				System.out.println(vect[i].toString());
			}
		}
		
		sc.close();
	}

}
