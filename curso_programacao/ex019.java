package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex019 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Leia 1 valor inteiro N, que representa o número de casos de teste\r\n"
				+ "que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles\r\n"
				+ "com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos\r\n"
				+ "de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3\r\n"
				+ "e o terceiro valor tem peso 5.");
		int nCasos;
		double notap2, notap3, notap5, calc;
		notap5 = 0;
		notap2 = 0;
		notap3 = 0;
		
		
		System.out.println("Digite o numero de casos: ");
		nCasos = sc.nextInt();
		for(int i=1; i < (nCasos+1); i++) {
			System.out.println("Nota peso 2: ");
			notap2 = sc.nextDouble();
			System.out.println("Nota peso 3: ");
			notap3 = sc.nextDouble();
			System.out.println("Nota peso 5: ");
			notap5 = sc.nextDouble();
			calc = ((notap2*2)+(notap3*3)+(notap5*5))/(2+3+5);
			System.out.printf("A media do caso " + i + " é igual a %.2f .%n", calc);
			System.out.println("XXXXXXXXXXxxxXXXXXXXXXX");
		}
		
		
		sc.close();
	}

}
