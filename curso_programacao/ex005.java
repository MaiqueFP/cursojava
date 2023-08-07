package curso_programacao;

import java.util.Scanner;

public class ex005 {
		public static void main(String[] argis) {
		Double vl1;
		Double vl2;
		Double calc1, calc2;
		int id1, id2 , qt1, qt2;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o\r\n"
				+ "código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.");
		System.out.println("Digite o ID do primeiro item : ");
		id1 = sc.nextInt();
		System.out.printf("Digite a quantidade do item ID %d : %n", id1);
		qt1 = sc.nextInt();
		System.out.printf("Digite o valor do item ID %d : %n", id1);
		vl1 = sc.nextDouble();
		System.out.println("XXXXXXXXXXXxXXXXXXXXXXX");
		
		System.out.println("Digite o ID do segundo item : ");
		id2 = sc.nextInt();
		System.out.printf("Digite a quantidade do item ID %d : %n", id1);
		qt2 = sc.nextInt();
		System.out.printf("Digite o valor do item ID %d : %n", id1);
		vl2 = sc.nextDouble();
		calc1 = vl1 * qt1;
		calc2 = vl2 * qt2;
		System.out.println("XXXXXXXXXXXxXXXXXXXXXXX");
		System.out.printf("ID: [ %d ]  Qtd: [ %d ]  TOTAL: [ %.2f ]%n", id1, qt1, calc1);
		System.out.println("XXXXXXXXXXXxXXXXXXXXXXX");
		System.out.printf("ID: [ %d ]  Qtd: [ %d ]  TOTAL: [ %.2f ]%n", id2, qt2, calc2);
		System.out.println("XXXXXXXXXXXxXXXXXXXXXXX");
		
			
		sc.close();
		
		
		
	}

}
