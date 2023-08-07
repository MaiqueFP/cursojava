package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex042 {
	public static void main(String[] argis) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Defina o numero de linhas: ");
		int lin = sc.nextInt();
				
		System.out.println("Defina o numero de colunas");
		int col = sc.nextInt();
		
		int[][] mat = new int[lin][col];
		System.out.println("Defina os numeros: ");
		
		for (int i = 0; i <mat.length; i++) {
			for (int j = 0; j <mat[i].length; j++) {
				mat[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("Matriz diagonal");
		for(int i = 0; i <mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		
		for (int i = 0; i <mat.length; i++) {
			for (int j = 0; j <mat[i].length; j++) {
				if(n == mat[i][j]) {
					if ((i+1) < mat.length) {
						System.out.println("Baixo " + mat[(i+1)][j]);
					}
					if ((j+1) < mat[i].length) {
						System.out.println("Direita " + mat[i][(j+1)]);
					}
					if ((i-1) >= 0) {
						System.out.println("Cima " + mat[(i-1)][j]);
					}
					if((j-1) >= 0) {
						System.out.println("Esquerda " + mat[i][(j-1)]);
					}
					
				}
			}
		}
		
		
		sc.close();
	}

}
