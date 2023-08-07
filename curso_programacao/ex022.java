package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex022 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Ler um número inteiro N e calcular todos os seus divisores.");
		int numero, calc, cont;
		cont=0;
		System.out.println("Digite um número:");
		numero = sc.nextInt();
		for(int i = 1; i <(numero+1); i++) {
			calc = numero%i;
			if(calc == 0) {
				System.out.println(i);
				cont+=1;
			}
		}
		if(cont <= 2) {
			System.out.printf("O numero %d é primo!" , numero);
		}
		else {
			System.out.printf("O número %d tem %d divisores", numero, cont);
			
		}
		
		sc.close();
	}

}
