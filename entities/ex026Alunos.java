package entities;

public class ex026Alunos {
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	public String media() {
		double calc = ((n1*30) + (n2*35)+ (n3*35))/100;
		double calc2 = 6-calc;
		if (calc >= 6) {
			return "O aluno " +nome+ " tem como media final "+ String.format("%.1f", calc)
					+ " pontos, estando APROVADO!";
		}
		else {
			return "O aluno " +nome+ " tem como media final "+ String.format("%.1f", calc)
					+ " pontos, falntando " + String.format("%.1f", calc2)
					+ " para alcançar a media 6. Estando Reprovado.";
		}
			
	}
	public String toString() {
		return "Aluno: "
				+ nome
				+"\r\nNotas: [ "
				+ n1 
				+ " / "
				+ n2 
				+ " / "
				+ n3 
				+ " ]"; 
	}

}
