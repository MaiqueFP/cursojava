package curso_programacao;

import java.util.Scanner;

public class ex006 {
	public static void main(String[] argis) {
		Double a, b, c, tri, circ, trap, quad, ret, pi;
		pi = 3.14159;
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.");
		System.out.println("Digite o valor de A : ");
		a = sc.nextDouble();
		System.out.println("Digite o valor de B : ");
		b = sc.nextDouble();
		System.out.println("Digite o valor de C : ");
		c = sc.nextDouble();
		System.out.println("XXXXXXXXXXXxXXXXXXXXXXX");
		tri = (a * c) /  2;
		circ = pi *( c * c );
		trap = ((a + b) * c ) / 2;
		quad = b * b ;
		ret = a * b;
		System.out.println("XXXXXXXXXXXxXXXXXXXXXXX");
		System.out.printf("Area do tiangulo de base " + a + " e alutra " + b + " é igual a : %.2f mt². %n", tri);
		System.out.println("XXXXXXXXXXXxXXXXXXXXXXX");
		System.out.printf("Area do circulo de raio " + c + " é igual a : %.2f mt². %n", circ);
		System.out.println("XXXXXXXXXXXxXXXXXXXXXXX");
		System.out.printf("Area do trapezio  de base'  " + a + " e base''  " + b + "e altura " + c + " é igual a : %.2f mt². %n", trap);
		System.out.println("XXXXXXXXXXXxXXXXXXXXXXX");
		System.out.printf("Area do quadrado de base " + b + " é igual a : %.2f mt². %n", quad);
		System.out.println("XXXXXXXXXXXxXXXXXXXXXXX");
		System.out.printf("Area do retangulo de base " + a + " e alutra " + b + " é igual a : %.2f mt². %n", ret);
		System.out.println("XXXXXXXXXXXxXXXXXXXXXXX");
		
		sc.close();
	}
}
