package curso_programacao;

import java.util.Locale;
import java.util.Scanner;


import entities.ex026Alunos;

public class ex026 {
	public static void main(String[] argis) {
		System.out.println("Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano\r\n"
				+ "(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no\r\n"
				+ "ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam\r\n"
				+ "para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para\r\n"
				+ "resolver este problema.");
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		ex026Alunos x, y;
		x = new ex026Alunos();
		y = new ex026Alunos();
		System.out.println("Digite o nome do aluno:");
		x.nome = sc.nextLine();
		System.out.println("Digite a 1ª nota:");
		x.n1 = sc.nextDouble();
		System.out.println("Digite a 2ª nota:");
		x.n2 = sc.nextDouble();
		System.out.println("Digite a 3ª nota:");
		x.n3 = sc.nextDouble();
		
		System.out.println("Digite o nome do aluno:");
		y.nome = sc.nextLine();
		sc.nextLine();
		System.out.println("Digite a 1ª nota:");
		y.n1 = sc.nextDouble();
		System.out.println("Digite a 2ª nota:");
		y.n2 = sc.nextDouble();
		System.out.println("Digite a 3ª nota:");
		y.n3 = sc.nextDouble();
		
		System.out.println(x);
		System.out.println(x.media());
		
		System.out.println("XXXXXXXXXXxxxxxXXXXXXXXXX");
		
		System.out.println(y);
		System.out.println(y.media());
		
		
		sc.close();
	}
	
	
	

}
