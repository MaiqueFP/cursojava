package entities;

public class ex025Funcionarios {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	
	
	public double salarioLiquido() {
		double calc = salarioBruto - imposto;
		return calc;
	}
	public void salarioBonus(double bonus) {
		double calc = salarioBruto * (bonus/100);
		this.salarioBruto = salarioBruto + calc;
	}
	
	
	public String toString() {
		return "O funcionario: "
				+ nome
				+" tem o salario Bruto de R$: " 
				+ String.format("%.2f", salarioBruto) 
				+ " com imposto de \r\nR$: " 
				+ String.format("%.2f",imposto) 
				+  " ficando com R$: " 
				+ String.format("%.2f", salarioLiquido())
				+ " de salario liguido.";
	}

}
