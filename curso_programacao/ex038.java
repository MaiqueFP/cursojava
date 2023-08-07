package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex038 {public static void main(String[] argis) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	System.out.println("Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes\r\n"
			+ "devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome\r\n"
			+ "da pessoa mais velha.");
	int maiorIdade = 0;
	String maiorNome=null;
	System.out.println("Digite o número de cadastros: ");
	int n = sc.nextInt();
	
	String[] nome = new String[n];
	int[] idade = new int[n];
	
	for(int i=0; i<nome.length;i++ ) {
		System.out.println("Digite o " +(i+1)+"º nome:");
		sc.nextLine();
		nome[i] = sc.nextLine();
		
		System.out.printf("Digite a idade de %s: \r\n",nome[i]);
		idade[i] = sc.nextInt();
		if (idade[i] >= maiorIdade) {
			maiorIdade=idade[i];
			maiorNome = nome[i];
		}
	}
	System.out.printf("O cadastrado com a maior idade é: %s com %d anos.",maiorNome, maiorIdade);
		
		
	
	
	
	sc.close();
}

}
