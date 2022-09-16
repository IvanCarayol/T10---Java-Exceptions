import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		NumeroAleatorio numAleatorio = new NumeroAleatorio();

		int num = 0;


			do {
				System.out.println("Introduzca un numero del 1 al 500)");
				
				try {
					numAleatorio.sumarIntento();
					num = teclado.nextInt();
					
					numAleatorio.comprobarNumero(num);

				} catch (InputMismatchException ex) {
					System.out.println("A continuacion inserte un numero entero.");
					teclado.next();

				}
			} while (num != numAleatorio.getNumRandom());


	}
}