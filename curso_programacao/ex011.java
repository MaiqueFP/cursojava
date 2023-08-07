package curso_programacao;

import java.util.Scanner;

public class ex011 {
	public static void main(String[] argis) {
		Double vl;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Você deve fazer um programa que leia um valor qualquer e\r\n"
				+ " apresente uma mensagem dizendo em qual dos seguintes intervalos \r\n"
				+ " ([0,25], (25,50], (50,75], (75,100]) este valor se encontra.\r\n"
				+ " Obviamente se o valor não estiver em nenhum destes intervalos,\r\n"
				+ " deverá ser impressa a mensagem “Fora de intervalo”.");
		System.out.println("Digite um numero: ");
		vl = sc.nextDouble();
		if (vl >= 0 && vl < 25) {
			System.out.printf("O número %.2f esta no intervalo [0, 25] ! %n",vl);
		}
		else {
			if (vl >= 25 && vl < 25) {
				System.out.printf("O número %.2f esta no intervalo [25, 50] ! %n",vl);
			}
			else {
				if (vl >= 50 && vl < 75) {
					System.out.printf("O número %.2f esta no intervalo [50, 75] ! %n",vl);
				}
				else {
					if (vl >= 75 && vl <100) {
						System.out.printf("O número %.2f esta no intervalo [75, 100] ! %n",vl);
					}
					else {
						System.out.printf("O número %.2f não esta em nenhum intervalo desiginado.%n", vl);					
					}
					
				}
				
			}
			
		}
		
			
				
		sc.close();		

}
}