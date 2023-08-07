package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ex041Funcionario;


public class ex041 {
	public static void main(String[] argis) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	System.out.println("Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de\r\n"
			+ "N funcionários. Não deve haver repetição de id.\r\n"
			+ "Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.\r\n"
			+ "Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma\r\n"
			+ "mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,\r\n"
			+ "conforme exemplos.\r\n"
			+ "Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa\r\n"
			+ "ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de\r\n"
			+ "aumento por porcentagem dada.");

	System.out.println("Digite o número de cadastos:");
	int ncadastro = sc.nextInt();
	
	List<ex041Funcionario> funcionario = new ArrayList<>();
	
	
	
	for(int i = 0;i < ncadastro;i++) {
		System.out.println("Digite o Id do funcinario: ");
		Integer id = sc.nextInt();
		
				
		while (posicao(funcionario, id) != null) {
			System.out.printf("O Id de número %d já consta no sistema digite um Id diferente:\r\n ",id);
			id = sc.nextInt();
		}
			
				
		System.out.println("Digite o nome do funcionario: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.printf("Digite o salario do funcionario %s : \r\n",nome);
		Double salario = sc.nextDouble();
		
		ex041Funcionario listaFuncionario = new ex041Funcionario(id, nome, salario);
		
		funcionario.add(listaFuncionario);
		}		
	
	System.out.println("Digite o Id do funcionario que receberá o bonus: ");
	int id2 = sc.nextInt();
	
	if ( posicao(funcionario, id2) != null) {
		int pos =posicao(funcionario, id2);
		System.out.println("digite o valor do bonus");
		
		((ex041Funcionario) funcionario.get(pos)).salarioBonus(sc.nextDouble());
		for(ex041Funcionario obj: funcionario ) {
			System.out.println(obj);
	}
	}
	else {
		for(ex041Funcionario obj: funcionario ) {
			System.out.println(obj);
	}
	}
		
	
	
	
	sc.close();
}


	public static Integer posicao(List<ex041Funcionario> funcionario, int id) {
		for(int i=0; i < funcionario.size();i++) {
			if (funcionario.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	
	
	

}
