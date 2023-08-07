package curso_programacao;

import java.util.Scanner;

public class ex016 {
	public static void main(String[] argis) {
		int pt, a, g, d, f, e;
		pt = 0;
		a = 0;
		g = 0;
		d = 0;
		e = 0;
		f = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Um Posto de combustíveis deseja determinar qual de seus produtos tem\r\n"
				+ "a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível\r\n"
				+ "abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).\r\n"
				+ "Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado\r\n"
				+ "um novo código (até que seja válido). O programa será encerrado quando o código informado\r\n"
				+ "for o número 4. Deve ser escrito a mensagem: \"MUITO OBRIGADO\" e a quantidade de clientes\r\n"
				+ "que abasteceram cada tipo de combustível, conforme exemplo.");
		
		while (pt !=4) {
			System.out.println("Digite o codigo do produto: ");
			pt = sc.nextInt();
			f += 1;
			if(pt==1) {
				a += 1;		
			}
			else {
				if( pt==2 ) {
					g +=1;					
				}
				else {
					if(pt == 3) {
						d += 1;
					}
					else {
						if(pt==4) {
							System.out.println("Fim");
						}
						else {
							System.out.println("Código Errado!");
							e += 1;
						}
					}
				}
			}
			
			
		}
		System.out.println("Foram realizadas as seguintes vendas: ");
		System.out.println("Álcool    [ " + a + " ]" );
		System.out.println("Gasolina  [ " + g + " ]" );
		System.out.println("Diesel    [ " + d + " ]" );
		System.out.println("O sitema foi usado: " + (f - 1) + " vezes, foram digitados " + e + " cogigos errados." );
		
		sc.close();
	}

}
