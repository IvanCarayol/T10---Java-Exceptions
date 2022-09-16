import java.util.Random;

public class main {

	public static void main(String[] args) {

		numeroAleatorio numAleatorio = new numeroAleatorio();

		System.out.println(numAleatorio);


		try {
			if (numAleatorio.esPar()) {
				throw new Exception("El numero " + numAleatorio + " es par.");
			} else {
				throw new Exception("El numero " + numAleatorio + " es impar.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
