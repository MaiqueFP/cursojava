package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.ex025Funcionarios;



public class ex025 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em\r\n"
				+ "seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o\r\n"
				+ "salário do funcionário com base em uma porcentagem dada (somente o salário bruto é\r\n"
				+ "afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe\r\n"
				+ "projetada abaixo.");
		ex025Funcionarios x, y;
		x = new ex025Funcionarios();
		y = new ex025Funcionarios();
		System.out.println("Digite o nome do funcionário: ");
		x.nome= sc.nextLine();
		System.out.println("Digite Salário Bruto do funcininario " + x.nome+ ":");
		x.salarioBruto = sc.nextDouble();
		System.out.println("Digite o valor do imposto cobrado do funcionário " +x.nome+ ":");
		x.imposto = sc.nextDouble();
		System.out.println(x);
		System.out.println("valor do bonus do funcionário "+ x.nome+ ":\r\n" );
		x.salarioBonus(sc.nextDouble());
		System.out.println("Contra-cheque de final de " +x.nome);
		System.out.println(x);
		
		System.out.println("Digite o nome do funcionário: ");
		y.nome= sc.nextLine();
		sc.nextLine();
		System.out.println("Digite Salário Bruto do funcininario " + y.nome+ ":");
		y.salarioBruto = sc.nextDouble();
		System.out.println("Digite o valor do imposto cobrado do funcionário " +y.nome+ ":");
		y.imposto = sc.nextDouble();
		System.out.println(y);
		System.out.println("valor do bonus do funcionário "+ y.nome+ ":\r\n" );
		y.salarioBonus(sc.nextDouble());
		System.out.println("Contra-cheque final de " + y.nome);
		System.out.println(y);
		
		sc.close();
	}
}
