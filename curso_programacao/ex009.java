package curso_programacao;

import java.util.Scanner;

public class ex009 {
	public static void main(String[] argis) {
		System.out.println("Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode\r\n"
				+ "começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.");
		
		int a, b, c, d;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora de inico do jogo: ");
		a = sc.nextInt();
		System.out.println("Digite a hora do final do jogo: ");
		b = sc.nextInt();
				
		if (b == 0) {
			b = 24;
		}
		if(a < b) { 
			c = b - a;
			System.out.println("O jogo Durou " + c + " horas!");				
			}
		
		else {
			d = (24 - a) + b;			
			System.out.println("O jogo Durou " + d + " horas!!");
			}
			
	
		
		sc.close();
		
	}

}


