package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex031 {

	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:\r\n"
				+ "- Imprimir todos os elementos do vetor\r\n"
				+ "- Mostrar na tela a soma e a média dos elementos do vetor");
		
		System.out.println("Digite a quantidade de numeros: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		double soma = 0;
								
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite o " + (i+1)+"º numero:" );
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		System.out.print("NÚMEROS: ");
		for(int i = 0; i < vect.length; i++) {
			System.out.printf(" %.2f ",vect[i]);
			if (i+1 == vect.length ) {
				System.out.println(" .");
			}
			else {
				System.out.print(" - ");
			}
			
		}
		double media = soma/n;
		System.out.printf("SOMA: %.2f \r\n", soma);
		System.out.printf("MEDIA: %.2f \r\n", media);
			
		sc.close();
	}

}
