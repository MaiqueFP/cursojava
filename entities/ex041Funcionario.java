package entities;


public class ex041Funcionario {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	public ex041Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void salarioBonus(double bonus) {
		double calc = salario * (bonus/100);
		this.salario += calc;
	}
	
	public String toString() {
		return "Id do funcionario: "+ id + ", " + nome + ", R$: " + String.format("%.2f", salario);
	}
	
}