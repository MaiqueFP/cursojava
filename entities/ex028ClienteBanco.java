package entities;

public class ex028ClienteBanco {
private final double TAXA = 5.0;
	
	private int idConta;
	private String nome;
	private double saldo;
	
	public ex028ClienteBanco() {		
	}
	public ex028ClienteBanco(int idConta, String nome) {
		this.idConta = idConta;
		this.nome = nome;
	}
	public ex028ClienteBanco(int idConta, String nome, double depositoInicial) {
		this.idConta = idConta;
		this.nome = nome;
		deposito(depositoInicial);
	}
	
	public double getTAXA() {
		return TAXA;
	}
	public int getIdConta() {
		return idConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double saque) {
		this.saldo -=  TAXA + saque;		
	}

	public String toString() {
		return "Conta Nº: [ "
				+ idConta
				+ " ] Cliente: "
				+ nome
				+ " Saldo: [R$: "
				+ String.format("%.2f", saldo)
				+ " ] ";
	
	}


}
