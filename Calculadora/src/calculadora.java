
public class calculadora {
	private double resultado;
	public static double suma(double num1, double num2) {

		return num1 + num2;

	}

	public static double resta(double num1, double num2) {

		return num1 - num2;

	}
	
	public static double dividir(double num1, double num2) {

		return num1 / num2;

	}
	
	public static double multiplicar(double num1, double num2) {

		return num1 * num2;

	}
	
	public static double raizCuadrada(double num1) {

		return Math.sqrt(num1);

	}
	
	public static double raizCubica(double num1) {

		return Math.cbrt(num1);

	}
	
	public static double potencia(double num1, double num2) {

		return Math.pow(num1, num2);

	}


}
