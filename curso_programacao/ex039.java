package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex039 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram\r\n"
				+ "no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir\r\n"
				+ "os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou\r\n"
				+ "igual a 6.0 (seis).");
		
		System.out.println("Digite o número de alunos: ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		double[] b1 = new double[n];
		double[] b2 = new double[n];
		
		for(int i = 0; i < nome.length; i++) {
			System.out.println("Digite o nome do "+(i+1)+ "º aluno: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.printf("Digite a nota do 1º bimestre de %s:\r\n",nome[i]);
			b1[i]= sc.nextDouble();
			System.out.printf("Digite a nota do 2º bimestre de %s: \r\n",nome[i]);
			b2[i]= sc.nextDouble();
		}
		System.out.println("Nome dos alunos aprodados: ");
		for(int i = 0; i< nome.length; i++) {
			double calc = (b1[i]+b2[i])/2;
			if (calc >=6) {
				System.out.println(nome[i]);
			}
		}
		
		
		sc.close();
	}

}
