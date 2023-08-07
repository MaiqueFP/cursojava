package entities;

public class ex029Hotel {
	private String nome;
	private String email;
	private int quarto;
	
	public ex029Hotel(String name, String email, int quarto) {
		this.nome = name;
		this.email = email;
		this.quarto = quarto;
	}
	public String getName() {
		return nome;
	}
	public void setName(String name) {
		this.nome = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getQuarto() {
		return quarto;
	}
	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}
	
	public String toString() {
		return "Quarto Nº: "
				+ quarto
				+ " Cliente: "
				+ nome
				+ " e-mail:  "
				+ email
				+ ". \r\n";	
	}

}
