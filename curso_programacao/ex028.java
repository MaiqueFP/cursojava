package curso_programacao;

import java.util.Locale;
import java.util.Scanner;


import entities.ex028ClienteBanco;

public class ex028 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do\r\n"
				+ "titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito\r\n"
				+ "inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua\r\n"
				+ "conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.\r\n"
				+ "Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já\r\n"
				+ "o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por\r\n"
				+ "exemplo).\r\n"
				+ "Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger\r\n"
				+ "isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque\r\n"
				+ "realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for\r\n"
				+ "suficiente para realizar o saque e/ou pagar a taxa.\r\n"
				+ "Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não\r\n"
				+ "informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre\r\n"
				+ "mostrando os dados da conta após cada operação.");
		
		ex028ClienteBanco x ;
		System.out.println("Digite o numero da conta: ");
		int idConta = sc.nextInt(); 
		System.out.println("Digite o nome do cliente: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Possue deposito incial? ");
		char r = sc.next().charAt(0);
		if (r == 's') {
			System.out.println("Digite o valor do deposito:");
			double depositoInicial = sc.nextDouble();
			x = new ex028ClienteBanco(idConta, nome, depositoInicial);
		}
		else {
			x= new ex028ClienteBanco(idConta, nome);
		}
		
		
				
		
		System.out.println(x);
		System.out.println("Digite o valor do deposito:");
		x.deposito(sc.nextDouble());
		
		System.out.println(x);
		
		System.out.println("Digite o valor do saque");
		x.saque(sc.nextDouble());
		
		System.out.println(x);
		
		
		sc.close();
	}

}
