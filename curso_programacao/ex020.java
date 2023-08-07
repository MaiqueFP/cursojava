package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex020 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Fazer um programa para ler um número N. Depois leia N pares de números\r\n"
				+ "e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,\r\n"
				+ " mostrar a mensagem \"divisao impossivel\".");
		int qtd;
		double numerador, denominador, calc;
		
		
		System.out.println("Digite a quantidade de operações: ");
		qtd = sc.nextInt();
		for(int i= 1; i< (qtd+1); i ++) {
			System.out.println("Digite o numerador:");
			numerador = sc.nextDouble();
			System.out.println("Digite o denominador:");
			denominador = sc.nextDouble();
			if(denominador ==0) {
				System.out.println("Operação "+ i + " invalida");
			}
			else {
				calc = numerador/denominador;
				System.out.printf("Resultado da operação " +i+ ": %.2f %n", calc);
				System.out.println("XXXXXXXXXXxxxXXXXXXXXXX");
			}
		}
		
		
		sc.close();
	}

}
