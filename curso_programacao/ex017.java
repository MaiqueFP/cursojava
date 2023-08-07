package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex017 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X,\r\n"
				+ "um valor por linha, inclusive o X, se for o caso.");
		int x, contador;
		contador = 0;
		System.out.println("Digite um valor entre 1 e 1000");
		x =sc.nextInt();
		while(x < 1 || x > 1000) {
			System.out.println("Numero fora do parametro especificado! Tente novamente.");
			System.out.println("Digite um valor entre 1 e 1000");
			x =sc.nextInt();			
		}
		if(x >=1 && x <=1000) {
			System.out.println("Numero dentro do parametro especificado!");
			for(int i=1;i <= x; i++) {
				if( i%2==1) {
					System.out.println(i);
					contador+=1;				
				}
		}
		
		}
		System.out.println("O total de numeros é " + contador);
		
		
		sc.close();
	}

}
