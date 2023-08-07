package curso_programacao;

import java.util.Scanner;

public class ex004 {
	public static void main(String[] argis) {
		Double valor, calc;
		int hora;
		String nome;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Calcular o salario do funcionario referente a quantidade de horas trabalhadas: ");
		System.out.println("Digite o nome do funcionario: ");
		nome = sc.next();
		System.out.printf("Digite a quantidade de horas trabalhaddas por %s : %n", nome);
		hora = sc.nextInt();
		System.out.printf("Digite o valor da hora trabalhada por %s : %n", nome);
		valor = sc.nextDouble();
		calc = valor * hora;
		System.out.printf("O funcionario " + nome + " trabalhou " + hora + " horas, com o valor de R$: " + valor + " a hora trabalhada, ficando com o salario de R$: %.2f !!%n", calc);
		
		sc.close();
		
		
		
	}

}
