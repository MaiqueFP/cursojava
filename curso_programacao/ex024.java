package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.ex024Retangulo;

public class ex024 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Fazer um programa para ler os valores da largura e altura\r\n"
				+ "de um retângulo. Em seguida, mostrar na tela o valor de\r\n"
				+ "sua área, perímetro e diagonal. Usar uma classe como\r\n"
				+ "mostrado no projeto ao lado.");
		ex024Retangulo x, y;
		x = new ex024Retangulo();
		y = new ex024Retangulo();
		
		System.out.println("Digite o valor da base do primerio retangulo: ");
		x.a = sc.nextDouble();
		System.out.println("Digite o valor da altura do primeiro retangulo: ");
		x.b = sc.nextDouble();
		System.out.println("Digite o valor da base do segundo retangulo: ");
		y.a = sc.nextDouble();
		System.out.println("Digite o valor da altura do segundo retangulo: ");
		y.b = sc.nextDouble();
		
		System.out.printf("No retangulo onde os a Base mede: %.2fcm e a alura mede: %.2fcm temos as seguintes metricas:%n", x.a, x.b);
		System.out.printf("Area medindo: %.2f cm². %n",x.area());
		System.out.printf("Perimetro medindo: %.2f cm². %n",x.perimetro());
		System.out.printf("Diagonal mediando: %.2f cm. %n",x.diagonal());
		System.out.println("XXXXXxxxxxXXXXX");
		System.out.printf("No retangulo onde os a Base mede: %.2fcm e a alura mede: %.2fcm temos as seguintes metricas:%n", y.a, y.b);
		System.out.printf("Area medindo: %.2f cm². %n",y.area());
		System.out.printf("Perimetro medindo: %.2f cm². %n", y.perimetro());
		System.out.printf("Diagonal mediando: %.2f cm. %n", y.diagonal());
		
		
		
		
		
		
		
		sc.close();
	}
}
