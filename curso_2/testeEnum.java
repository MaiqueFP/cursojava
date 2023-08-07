package curso_2;


import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.pedidos;
import entities.enums.ordemDeStatus;

public class testeEnum {
	
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		pedidos cliente01 = new pedidos(1080, new Date(), ordemDeStatus.AGUARDANDO_PAGAMENTO);
		
		System.out.println(cliente01);
		
		ordemDeStatus os1 = ordemDeStatus.ENTREGE;
		ordemDeStatus os2 = ordemDeStatus.valueOf("ENVIADO");
		
		
		System.out.println(os1);
		System.out.println(os2);
		
		
		sc.close();
	}

}
