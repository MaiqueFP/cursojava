package curso_programacao;

import java.util.Locale;
import java.util.Scanner;


public class ex030 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros\r\n"
				+ "e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.");
		
		System.out.println("Digite a quantidade de numeros: ");
		int n = sc.nextInt();
		int[] vect = new int[n]; 
		
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite o " + (i+1)+"º numero:" );
			vect[i] = sc.nextInt();
			 
		}
		System.out.println("NÚMEROS NEGATIVOS:");
		for(int i = 0; i < vect.length; i++) {
			if (vect[i] <0) {
				System.out.println(vect[i]);
				
			}
		}
		
		
		sc.close();
	}

}
