package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex040 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa\r\n"
				+ "que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número\r\n"
				+ "de homens.");
		System.out.println("Digite o número de cadastros: ");
		int n = sc.nextInt();
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		double maior = 0;
		double menor =0;
		double somaf = 0;
		int contm =0;
		int contf = 0;
		
		for(int i =0; i < altura.length;i++) {
			System.out.println("digite a altura do " +(i+1)+"º cadastro:");
			altura[i]= sc.nextDouble();
			if(i==0) {
				maior = altura[i];
				menor = altura[i];
			}
			else {
				if(altura[i]>=maior) {
					maior = altura[i];
				}
				else {
					if(altura[i]<=menor) {
						menor = altura[i];
					}
				}
			}
			System.out.println("Digite o gênero do "+(i+1)+"º cadastro [F/M]");
			genero[i] = sc.next().charAt(0);
			while(genero[i] != 'f' && genero[i] != 'm' && genero[i] != 'F' && genero[i] != 'M') {
				System.out.println("digite: [ F ] ou [ M ]: ");
				genero[i] = sc.next().charAt(0);				
			}
			if(genero[i] == 'f' || genero[i] == 'F') {
				somaf += altura[i];
				contf += 1;
			}
			else {
				contm+=1;
			}
		}
		System.out.printf("Maior: %.2f Mt.\r\n",maior);
		System.out.printf("Menor: %.2f Mt. \r\n", menor);
		if (contf ==0) {
			System.out.println("Não ha cadastros femininos.");
		}
		else {
			System.out.printf("Media feminina: %.2f \r\n",(somaf / contf));
		}
		if(contm == 0) {
			System.out.println("Não ha cadastros masculinos.");
		}
		else {
			System.out.printf("Ha %d cadastros masculinos",contm);
		}
		
		sc.close();
	}
	

}
