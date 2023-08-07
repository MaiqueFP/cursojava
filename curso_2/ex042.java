package curso_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ex042Departamento;
import entities.ex042Funcionario;
import entities.ex042HoraContrato;
import entities.enums.ex042nivelTrabalho;

public class ex042 {
	public static void main(String[] argis) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		System.out.println("Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar\r\n"
				+ "do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo\r\n"
				+ "(próxima página).");
		
		System.out.println("Nome do Departamento:");
		String dp = sc.nextLine();
		System.out.println("Digite o nome do funcionario:");
		String nome = sc.nextLine();
		System.out.println("Digite o Nivel do funcionario: ");
		String nivel = sc.nextLine();
		System.out.println("Digite o Salario Base: ");
		Double salBase = sc.nextDouble();
		
		ex042Funcionario func = new ex042Funcionario(nome, ex042nivelTrabalho.valueOf(nivel), salBase, new ex042Departamento(dp));
		
		System.out.println("Defina o número que registros");
		int n = sc.nextInt();
		
		for(int i = 1; i <=n ;i++) {
			System.out.println("Contrato Nº "+ i);
			System.out.print("Data: ");
			Date contratoData = sdf.parse(sc.next());
			
			System.out.print("Valor por hora: ");
			double valHora = sc.nextDouble();
			System.out.print("Duação: ");
			int horas = sc.nextInt();
			ex042HoraContrato contratoMes = new ex042HoraContrato(contratoData, valHora, horas);
			func.addContrato(contratoMes);
			
		}
		
		System.out.println("Digite o mês e o ano para calcular o salario:");
		String datasal = sc.next();
		int mes = Integer.parseInt(datasal.substring(0, 2));
		int ano = Integer.parseInt(datasal.substring(3));
		
		System.out.println("Nome " + func.getName());
		System.out.println("Departamento " + func.getDepartamento().getNomeDepartamento());
		System.out.println("Salario total em " + datasal+ " R$: " + String.format("%.2f" ,func.salarioDoMes(mes, ano)));
		
		
		
		sc.close();
	}

}
