package curso_programacao;

import java.util.Scanner;

public class ex003 {
	public static void main(String[] argis) {
		Double a, b, c, d, resultado;		
		Scanner sc = new Scanner(System.in);
		System.out.println("calcule e mostre a diferença do produto\r\n"
				+ "de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D): ");
		System.out.println("Digite o valor de A:");
		a = sc.nextDouble();
		System.out.println("Digite o valor de B:");
		b = sc.nextDouble();
		System.out.println("Digite o valor de C:");
		c = sc.nextDouble();
		System.out.println("Digite o valor de D:");
		d = sc.nextDouble();
		resultado = a * b - c * d;
		System.out.printf ("O resultado da diferença entre o produto de " + a + " e " + b + " pelo produto de " + c + " e " + d + " é igual a : %.3f !!", resultado);
		
				
				
				
		sc.close();
	}

}
