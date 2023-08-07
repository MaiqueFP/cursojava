package curso_programacao;

import java.util.Locale;

public class ex000 {

	public static void main(String[] args) {		 
		String prod1 = "Computer";
		String prod2 = "Office desk";
		int idade = 30;
		int id = 5290;
		char genero = 'F';
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Em seguida, usando os valores das variáveis,%n"+ "produza a seguinte saída na tela do console:");
		System.out.printf("Produtos:%n"+
				"Computador, cujo preço é R$ 2100,00%n"+
				"Mesa de escritório, cujo preço é R$ 650,50%n%n"+
				"Registro: 30 anos, código 5290 e gênero: F%n%n"+
				"Medida com oito casas decimais: 53,23456700%n"+
				"Arredondado (três casas decimais): 53.235%n"+
				"Ponto decimal dos EUA: 53,235%n%n");
		
		
		System.out.println("######");		
		System.out.printf("Produtos:%n"+
				"%s, cujo preço é R$ %.2f%n", prod1, preco1);
		
		System.out.println("######");
		System.out.printf("%s, cujo preço é R$ %.2f%n%n", prod2, preco2);
		
		System.out.println("######");						
		System.out.printf("Registro: %d anos, código %d e gênero: %c%n%n", idade, id, genero);
		
		System.out.println("######");
		System.out.printf("Medida com oito casas decimais: %.8f%n", measure);
		
		System.out.println("######");
		System.out.printf("Arredondado (três casas decimais): %.3f%n", measure);
		
		System.out.println("######");
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto decimal dos EUA: %.2f", measure);
		
				
				
	}

}
