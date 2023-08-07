package curso_programacao;

import java.util.Scanner;

public class ex008 {
	public static void main(String[] argis) {
		System.out.println("Fazer um programa para ler dois numeros e saber se são multiplos ou não");
		
		int a, b, c, d;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A : ");
		a = sc.nextInt();
		System.out.println("Digite o valor de B : ");
		b = sc.nextInt();
				
		if(a > b) { 
			c = a % b;
			if(c == 0 ) {
				System.out.println("São Multiplos!");
			}
			else {
				System.out.println("Não são multiplos!");				
			}
		}
		else {
			d = b % a;			
			if(d == 0 ) {
				System.out.println("São Multiplos!!");
			}
			else {
				System.out.println("Não são multiplos!!");				
			}
		sc.close();
		
	}

}
}