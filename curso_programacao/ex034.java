package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex034 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela\r\n"
				+ "o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,\r\n"
				+ "considerando a primeira posição como 0 (zero).");
		
		System.out.println("Quantos numeros serão verificados? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double maior = 0;
		int posicao = 0;
		
		for(int i=0; i< vect.length; i++) {
			System.out.printf("Digite o " + (i+1) +"º numero: ");
			vect[i]=sc.nextDouble();
		}
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i]>maior ) {
				maior=vect[i];
				posicao=i;
			}
		}
		
		System.out.println("O maior numero é: "+ maior);
		System.out.println("O maior numero esta na posição: "+ posicao);
			
		
		
		
		sc.close();
	}

}
