package curso_programacao;

import java.util.Scanner;

public class ex012 {
	public static void main(String[] argis) {
		Double x, y;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas\r\n"
				+ "	de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o\r\n"
				+ "	ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).\r\n"
				+ "	Se o ponto estiver na origem, escreva a mensagem “Origem”.\r\n"
				+ "	Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a\r\n"
				+ "	situação. ");
		
		System.out.println("Digite o valor de X: ");
		x = sc.nextDouble();
		
		System.out.println("Digite o valor de Y: ");
		y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else {
			if (x == 0 && y != 0) {
				System.out.println("Eixo Y");
			}
			else {
				if (x != 0 && y == 0) {
					System.out.println("Eixo X");
				}
				else {
					if (x > 0 && y > 0) {
						System.out.printf("Com os números X = %.2f e Y = %.2f temos o ponto no quadrande Q1. ", x, y);
					}
					else {
						if (x < 0 && y > 0) {
							System.out.printf("Com os números X = %.2f e Y = %.2f temos o ponto no quadrande Q2. ", x, y);
						}
						else {
							if (x < 0 && y < 0) {
								System.out.printf("Com os números X = %.2f e Y = %.2f temos o ponto no quadrande Q3. ", x, y);
							}
							else {
								if (x > 0 && y < 0) {
									System.out.printf("Com os números X = %.2f e Y = %.2f temos o ponto no quadrande Q4. ", x, y);
								}
					
				}
				
			}
			
		}
		
			
				
		sc.close();		

}
			}
		}
	}
}
