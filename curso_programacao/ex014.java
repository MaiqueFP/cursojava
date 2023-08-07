package curso_programacao;

import java.util.Scanner;

public class ex014 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um programa que repita a leitura de uma senha até que ela seja válida.\r\n"
				+ "Para cada leitura de senha incorreta informada, escrever a mensagem \"Senha Invalida\".\r\n "
				+ "Quando a senha for informada corretamente deve ser impressa a mensagem \"Acesso Permitido\"\r\n"
				+ "e o algoritmo encerrado. Considere que a senha correta é o valor 2002.");
		
		int x;
		x = 0;
		
		while (x != 2002) {
			System.out.println("Digite a senha: ");
			x = sc.nextInt();
			
			if (x != 2002) {
				System.out.println("Senha invalida!!");
			}
			else {
				System.out.println("Senha Correta!!!");
			}
			}
			
		
		
		
		
		
		
		
		sc.close();
	}

}
