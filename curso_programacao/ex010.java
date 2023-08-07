package curso_programacao;

import java.util.Scanner;

public class ex010 {
	public static void main(String[] argis) {
		Double vl = null, calc;
		int id = 0, qt;
		String nome;
		nome = " ";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Com base na tabela abaixo, escreva um programa que leia o código de um item\r\n"
				+ " e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.");
		
			
		System.out.println("Digite o ID do item : ");
		id = sc.nextInt();
		if(id == 1) {
			nome = "Cachorro quente";
			vl = 4.00;
		}
		if(id == 2) {
			nome = "X - Salada";
			vl = 4.50;
		}
		if(id == 3) {
			nome = "X - Bacon";
			vl = 5.00;
		}
		if(id == 4) {
			nome = "Torta Simples";
			vl = 2.00;
		}
		if(id == 5) {
			nome = "Refrigerante";
			vl = 1.50;
		}
		if (id != 1 && id != 2 && id != 3 && id != 4 && id != 5) {
			System.out.println("ID não consta no sistema!");
			
		}
		else {
			System.out.printf("Digite a quantidade de %s consumidos : %n", nome);
			qt = sc.nextInt();
			calc = qt * vl;
			System.out.println("XXXXXXXXXXXxXXXXXXXXXXX");
			System.out.printf("ID: [ %d ] Nome [ %s ] Qtd: [ %d ]  TOTAL: [ %.2f ]%n", id, nome, qt, calc);
			System.out.println("XXXXXXXXXXXxXXXXXXXXXXX");
			
		}
			
		sc.close();
		
		
		
	}

}