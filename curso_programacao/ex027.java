package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import utilitario.ex026ConversorMoedas;

public class ex027 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por\r\n"
				+ "uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda\r\n"
				+ "que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter\r\n"
				+ "para ser responsável pelos cálculos.");
		double dolar =0;
		double pretendido = 0;
		
		System.out.println("Valor do Dolar hoje.");
		dolar = sc.nextDouble();
		System.out.println("Valor pretendido: ");
		pretendido = sc.nextDouble();
		double total = ex026ConversorMoedas.totalReais(dolar, pretendido);
		System.out.println(total);
		
		sc.close();
	}


}
