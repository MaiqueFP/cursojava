package curso_programacao;

import java.util.Scanner;

public class ex013 {
	public static void main(String[] argis) {
		Double x, cal1,p1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem\r\n"
				+ "que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem\r\n"
				+ "qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.\r\n"
				+ "Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e\r\n"
				+ "mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.\r\n"
				+ "Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de\r\n"
				+ "salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é\r\n"
				+ "de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com\r\n"
				+ "duas casas decimais.");
		
		System.out.println("[ RENDA                 ] ## [ IMPOSTO ] ");
		System.out.println("[ R$:   0,00 X 2000,00  ] ## [ ISENTO  ] ");
		System.out.println("[ R$:2000,01 X 3000,00  ] ## [ 8%      ] ");
		System.out.println("[ R$:3000,01 X 4500,00  ] ## [ 18%     ] ");
		System.out.println("[ ACIMA DE 4500,00      ] ## [ 28%     ] ");
		
		System.out.println("Digite o valor do salario: ");
		x = sc.nextDouble();
		
				
		if (x >= 0 && x < 2000) {
			System.out.printf("Com o salario de R$: %.2f o cidadão e isento. ", x);
		}
		else {
			if (x >= 2000 && x <= 3000) {
				p1 = (x - 2000) * 0.08;
				cal1 = x - p1;
				System.out.printf("Com o salario de R$: %.2f o cidadão e tem um \r\n"
						+ "desconto de R$: %.2f recebando R$: %.2f . ", x, p1, cal1);
			}
			else {
				if (x > 3000 && x <= 4500) {
					p1 = ((x - 3000)* 0.18 )+(999.99 * 0.08);
					cal1 = x - p1;
					System.out.printf("Com o salario de R$: %.2f o cidadão e tem um \r\n"
							+ "desconto de R$: %.2f recebando R$: %.2f . ", x, p1, cal1);
				}
				else {
					if (x > 4500) {
						p1 = (((x - 4500)* 0.28) + ((1499.99)* 0.18 )+(999.99 * 0.08));
						cal1 = x - p1;
						System.out.printf("Com o salario de R$: %.2f o cidadão e tem um \r\n"
								+ "desconto de R$: %.2f recebando R$: %.2f . ", x, p1, cal1);
					}
			
		
			
				
		sc.close();		

}
			}
		
	}
}
}



