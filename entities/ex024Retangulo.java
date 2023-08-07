package entities;

public class ex024Retangulo {
	 public double a;
	 public double b;
	 
	 public double area() {
		 double calc = a * b;
		 return calc;
	 }
	 public double perimetro() {
		 double calc = (a+b)*2;
		 return calc;
	 }
	 public double diagonal() {
		 double calc = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		 return calc;
	 }


}
