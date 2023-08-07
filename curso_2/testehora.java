package curso_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class testehora {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println(ldt.format(f1));
		


		
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getMonth());
		System.out.println(ldt.getMonthValue());
		System.out.println(ldt.getYear());
		System.out.println(ldt.getHour());
		System.out.println(ldt.getMinute());
		System.out.println(ldt.getSecond());
		sc.close();
	}

	
	

}

