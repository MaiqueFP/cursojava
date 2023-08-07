package curso_programacao;

import java.util.Locale;
import java.util.Scanner;


import entities.ex032Cadastro;

public class ex032 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na\r\n"
				+ "tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,\r\n"
				+ "bem como os nomes dessas pessoas caso houver.");
		
		System.out.println("Digite a quantidade cadastros: ");
		int n = sc.nextInt();
		ex032Cadastro[] vect = new ex032Cadastro[n];
		double soma = 0;
		double contIdade =0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite o " + (i+1)+"º cadastro:" );
			sc.nextLine();
			System.out.println("digite o nome do cliente");
			String nome = sc.nextLine();
			System.out.println("digite a idade:");
			int idade = sc.nextInt();
			System.out.println("digite a altura: ");
			double altura = sc.nextDouble();
			soma += altura;
			if (idade < 16) {
				contIdade +=1;
			}
			vect[i] = new ex032Cadastro(nome, idade, altura);
		}
		
		double mediaAltura = soma/n;
		double porcIdade = (contIdade/n)*100;
		
		System.out.printf("Altura media: %.2fMt . \r\n", mediaAltura);
		System.out.printf("Porcentagem de menores de 16 anos %.2f . \r\n", porcIdade);
		System.out.println("cadastrados com menos de 16 anos: ");
		for(int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}
		
	
		
		
		sc.close();
	}

}
