package curso_programacao;

import java.util.Scanner;

public class ex015 {
	public static void main(String[] argis) {
		Double x, y;
		int m = 0;
		
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva um programa para ler as coordenadas (X,Y) de uma quantidade\r\n"
				+ " indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o\r\n"
				+ " quadrante a que ele pertence. O algoritmo será encerrado quando pelo\r\n"
				+ "	menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).");
		
		System.out.println("Digite o valor de X: ");
		x = sc.nextDouble();
		
		System.out.println("Digite o valor de Y: ");
		y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
			System.out.printf("Fim %n");
		}
		else {
			if (x == 0 && y != 0) {
				System.out.println("Eixo Y");
				System.out.printf("Fim %n");
			}
			else {
				if (x != 0 && y == 0) {
					System.out.println("Eixo X");
					System.out.printf("Fim %n");
				}
			}
		}
		
		while (x != 0 && y != 0 ) {
			
				System.out.println("Digite o valor de X: ");
				x = sc.nextDouble();
			
				System.out.println("Digite o valor de Y: ");
				y = sc.nextDouble();
				
				
			
			m =+ 1;
			
			if (x == 0 && y == 0) {
				System.out.println("Origem");
				System.out.printf("Fim %n");
				
			}
			else {
				if (x == 0 && y != 0) {
					System.out.println("Eixo Y");
					System.out.printf("Fim %n");
				}
				else {
					if (x != 0 && y == 0) {
						System.out.println("Eixo X");
						System.out.printf("Fim %n");
					}
					else {
						if (x > 0 && y > 0) {
							System.out.printf("Com os números X = %.2f e Y = %.2f temos o ponto no quadrande Q1. %n", x, y);
						}
						else {
							if (x < 0 && y > 0) {
								System.out.printf("Com os números X = %.2f e Y = %.2f temos o ponto no quadrande Q2. %n", x, y);
							}
							else {
								if (x < 0 && y < 0) {
									System.out.printf("Com os números X = %.2f e Y = %.2f temos o ponto no quadrande Q3. %n", x, y);
								}
								else {
									if (x > 0 && y < 0) {
										System.out.printf("Com os números X = %.2f e Y = %.2f temos o ponto no quadrande Q4. %n", x, y);
									}
								}
							}
						}
					}
					}
			}
	}
		System.out.println("o programa rodou " + (m + 1) +" vezes " );
		sc.close();		
			}
		}




	

