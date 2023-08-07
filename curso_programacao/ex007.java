package curso_programacao;

import java.util.Scanner;

public class ex007 {
	public static void main(String[] argis) {
			System.out.println("Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.");
			
			int a, b, c, d;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o valor de A : ");
			a = sc.nextInt();
			System.out.println("Digite o valor de B : ");
			b = sc.nextInt();
			c = a + b;
			d = a - b;
			
			if(c >= 0) { 
				System.out.println("Soma Positiva!");	
			}
			else {
				System.out.println("Soma Negativo!");
			}
			if(d >= 0) { 
				System.out.println("Diferança Positiva!");	
			}
			else {
				System.out.println("Diferança Negativa");
			}
			
			sc.close();
			
		}

}

