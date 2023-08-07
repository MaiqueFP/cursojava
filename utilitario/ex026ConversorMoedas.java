package utilitario;

public class ex026ConversorMoedas {
public static final double IOF = 6.0;
		
	
	public static double totalReais(double valorDolar, double valorPretendido) {
		double calc = (valorDolar * valorPretendido);
		double calc2 = calc * IOF/100;
		return calc +calc2;
	}

}
