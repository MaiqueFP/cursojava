package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex033 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na\r\n"
				+ "tela todos os números pares, e também a quantidade de números pares.");
		
		System.out.println("Digite a quantidade de numeros: ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		int somaPar = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite o " + (i+1)+"º numero:" );
			vect[i] = sc.nextInt();
						
		}
		System.out.println("Numeros Pares: ");
		for(int i = 0; i < vect.length; i++) {
			if( vect[i]%2 ==0 ) {
				System.out.printf(" %d ",vect[i]);
				somaPar += 1;
				if (i+1 == vect.length ) {
					System.out.println(" .\r\n");
				}
				else {
					System.out.print(" - ");
				}
			}
		}
		System.out.printf("Quantidade de numemos pares: %d", somaPar);
		
		sc.close();
	}

}
