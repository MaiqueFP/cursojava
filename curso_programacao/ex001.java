package curso_programacao;

import java.util.Scanner;

public class ex001 {
	public static void main(String[] argis) {
		int x, y, resultado;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Soma entre duas variáveis: ");
		System.out.println("Digite o primeiro número:");
		x = sc.nextInt();
		System.out.println("Digite o segundo número:");
		y= sc.nextInt();
		resultado = x + y;
		System.out.printf ("O resultado da soma entre " + x + " e " + y + " é igual a : %d !!", resultado);
		
				
				
				
		sc.close();
	}

}
