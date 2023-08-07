package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex035 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um\r\n"
				+ "terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima\r\n"
				+ "o vetor C gerado.");
		
		System.out.println("Digite o numero de vetores: ");
		int nvet = sc.nextInt();
		int[] a = new int[nvet];
		int[] b = new int[nvet];
		int[] c = new int[nvet];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Digite o " + (i+1)+ "º número do vetor A: ");
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<b.length;i++) {
			System.out.println("Digite o " + (i+1)+ "º número do vetor B: ");
			b[i]=sc.nextInt();
		}
		for(int i=0;i<c.length;i++) {
			System.out.println("O " + (i+1)+ "º número do vetor A: ");
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
		}
		
		
		
		sc.close();
	}

}
