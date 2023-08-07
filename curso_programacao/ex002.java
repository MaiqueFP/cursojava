package curso_programacao;

import java.util.Scanner;

public class ex002 {
	public static void main(String[] argis) {
		double x, pi, resultado;
		pi = 3.14159;
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Calcular a area do circulo com quatro casas decimais: ");
		System.out.println("Digite valor do raio:");
		x = sc.nextDouble();
		resultado = pi* (x * x);
		System.out.printf ("A area do circulo de raio = " + x + " é %.4f !!%n", resultado);
		System.out.println(resultado);
		
				
				
				
		sc.close();
}
}