package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex036 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,\r\n"
				+ "mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos\r\n"
				+ "os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.");
		
		System.out.println("Digite a quantidade de numeros: ");
		int n = sc.nextInt();
		double[] media = new double[n];
		double soma = 0;
		
		
		for(int i =0; i<media.length;i++) {
			System.out.println("Digite o " + (i+1)+ "º número: ");
			media[i] = sc.nextDouble();
			soma += media[i];
		}
		double calc = soma/n;
		
		System.out.printf("Media do vetor: %.3f \r\n", calc);
		System.out.println("Numeros abaixo da media: ");
		for(int i =0; i<media.length;i++) {
			if(media[i]<calc) {
				System.out.printf(" %.1f \r\n",media[i]);
			}
			
		}
		
		sc.close();
	}

}
