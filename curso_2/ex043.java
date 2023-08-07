package curso_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.ex043Comentarios;
import entities.ex043Post;

public class ex043 {
	public static void main(String[] argis) throws ParseException {
		
		System.out.println("Instancie manualmente (hard code) os objetos mostrados abaixo e mostre-os\r\n"
				+ "na tela do terminal, conforme exemplo. ");
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d1 = LocalDateTime.now();
		
		ex043Post p1 = new ex043Post(sdf.parse("21/06/2018 13:05:44"),
				"Viajando para a Nova Zelândia",
				"Vou visitar este país maravilhoso!",
				12);
		
		ex043Comentarios c1 = new ex043Comentarios("Faça uma boa viagem.");
		ex043Comentarios c2 = new ex043Comentarios("Uau, isso é incrível!");
		
		p1.addComentario(c1);
		p1.addComentario(c2);
				
		System.out.print(p1);
		
		ex043Post p2 = new ex043Post(sdf.parse("28/07/2018 23:14:19"),
				"Boa noite, galera",
				"Vejo você amanhã",
				5);
		
		ex043Comentarios c3 = new ex043Comentarios("Boa noite");
		ex043Comentarios c4 = new ex043Comentarios("Que a força esteja com você");
		
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		System.out.println(p2);
		
		/* tentativa de fazer com o usuario completando */ 
		
		
		
		
		System.out.println("Titulo do post");
		String titulo = sc.nextLine();
		System.out.println("Comentario do Post");
		String comentario = sc.nextLine();
		
		
		int like = 0;
		String d2= f1.parse(d1.format(f1)).toString();
		
		
		ex043Post p3 = new ex043Post(d2, titulo, comentario, like);
		
		
		
		
		
		sc.close();
	}
	
	

}
