package curso_programacao;

public class testefor {
	public static void main(String[] argis) {
		int x, y;
		x = 4;
		y = x + 2;
		for(int i=0; i<x; i++) {
			System.out.println(i);
			System.out.print(x+" "+y );
			y = y +i;
			System.out.println("xx" + i);
		}
		
		
	}
}
