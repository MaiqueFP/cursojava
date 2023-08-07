package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex037 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média\r\n"
				+ "aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for\r\n"
				+ "digitado, mostrar a mensagem \"NENHUM NUMERO PAR\"");
		
		int contpar =0;
		int somapar = 0;
		System.out.println("Digite a quantidade de numeros: ");
		int n = sc.nextInt();
		int[] par = new int[n];
		
		for(int i =0; i<par.length; i++) {
			System.out.println("Digite o " + (i+1)+ "º número: ");
			par[i] = sc.nextInt();
			if(par[i]%2 == 0) {
				somapar+=par[i];
				contpar+=1;
			}
		}
		
		if (contpar==0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			double calc = somapar/contpar;
			System.out.printf("Media de números pares: %.1f ",calc);
		}
		
		sc.close();
	}

	
	
}
