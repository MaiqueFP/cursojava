package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex018 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que\r\n"
				+ "serão lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20]\r\n"
				+ "e quantos estão fora do intervalo, mostrando essas informações conforme exemplo\r\n"
				+ "(use a palavra \"in\" para dentro do intervalo, e \"out\" para fora do intervalo).");
		
		int qtd, x, contIn, contOut;
		x = 0;
		contIn = 0;
		contOut = 0;
		System.out.println("Digite a quantidade de repetiçoes: ");
		qtd = sc.nextInt();
		for(int i=0; i < qtd; i++) {
			x = sc.nextInt();
			
			if(x>=10 && x<=20) {
				contIn +=1;				
			}
			else {
				contOut +=1;
			}
		}
		System.out.println("In = " + contIn);
		System.out.println("Out = " + contOut);
		sc.close();
	}

}
