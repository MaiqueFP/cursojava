package entities;

public class ex032Cadastro {
	
	private String nome;
	private int idade;
	private double altura;
	
	public ex032Cadastro(String nome, int idade, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	public String toString() {
		return "cadastro [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
	}
	
	
	
	

}
