package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex021 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Ler um valor N. Calcular e escrever seu respectivo fatorial.\r\n"
				+ "Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que,\r\n"
				+ "por definição, fatorial de 0 é 1.");
		int numero, fator;
		fator = 1;
		System.out.println("Digite o número a ser fatorado: ");
		numero = sc.nextInt();
		if (numero == 0) {
			fator = 1;			
		}
		else {
			for(int i = numero; i >0 ; i --) {
				fator *= i;
			}			
		}
		
		System.out.printf("O Fatorial de %d é igual a: %d . %n", numero, fator);
		sc.close();
	}

}
