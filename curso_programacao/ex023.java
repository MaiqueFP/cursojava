package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex023 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Fazer um programa para ler um número inteiro positivo N.\r\n"
				+ "O programa deve então mostrar na tela N linhas, começando de 1 até N.\r\n"
				+ "Para cada linha, mostrar o número da linha, depois o quadrado e o cubo\r\n"
				+ "do valor, conforme exemplo.");
		int n, calc2,calc3;
		System.out.println("Digite um numero: ");
		n = sc.nextInt();
		for(int i = 1; i < (n+1); i++) {
			calc2 = i*i;
			calc3 = i*i*i;
			System.out.print(i + "   " + calc2 + "   " + calc3 + "\r\n" );
		}
		
		sc.close();
	}

}
