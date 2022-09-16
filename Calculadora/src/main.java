import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int operacion = 1;
		
		
		try {
	
			do {
					System.out.println("Inserte el numero de la operacion. (1.Suma 2.resta, 3.dividir, 4.multiplicar 5.raiz cuadrada 6.raiz cubica 7.potencia)");
					operacion = teclado.nextInt();
				
				
			} while(operacion < 1 || operacion > 7);

			
			double resultado = 0;
			double num1 = 0;
			double num2 = 0;
			
			switch (operacion) {
			case 1:
				
				System.out.println("Inserte un numero.");
				num1 = teclado.nextInt();
				System.out.println("Inserte otro numero.");
				num2 = teclado.nextInt();
				
				resultado = calculadora.suma(num1, num2);
				
				break;
			case 2:
				System.out.println("Inserte un numero.");
				num1 = teclado.nextInt();
				System.out.println("Inserte otro numero.");
				num2 = teclado.nextInt();
				
				resultado = calculadora.resta(num1, num2);
				break;

			case 3:
				System.out.println("Inserte un numero.");
				num1 = teclado.nextInt();
				System.out.println("Inserte otro numero.");
				num2 = teclado.nextInt();
				
				resultado = calculadora.dividir(num1, num2);
				break;

			case 4:
				System.out.println("Inserte un numero.");
				num1 = teclado.nextInt();
				System.out.println("Inserte otro numero.");
				num2 = teclado.nextInt();
				
				resultado = calculadora.multiplicar(num1, num2);
				break;

			case 5:
				System.out.println("Inserte un numero.");
				num1 = teclado.nextInt();
				
				resultado = calculadora.raizCuadrada(num1);
				break;

			case 6:
				System.out.println("Inserte un numero.");
				num1 = teclado.nextInt();
				
				resultado = calculadora.raizCubica(num1);
				break;

			case 7:
				System.out.println("Inserte un numero.");
				num1 = teclado.nextInt();
				System.out.println("Inserte otro numero.");
				num2 = teclado.nextInt();
				
				resultado = calculadora.potencia(num1, num2);
				break;

			}
			
			System.out.println("Resultado: " + resultado);

		} catch (NumberFormatException e) {
			System.out.println(e);
			
		} catch (InputMismatchException ex) {
			System.out.println(ex);
			
		}



	}

}
