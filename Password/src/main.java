import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Inserta el numero de arrays que quieres");
		int num = teclado.nextInt();
		
		Password[] password = new Password[num];
		
		boolean[] esfuerte = new boolean[num];
		
		// Creamos objetos
		for (int i = 0; i < password.length; i++) {
			
			int numero = (int)(Math.random()*18 + 7);
			
			password[i] = new Password(numero);
			
			
			esfuerte[i] = password[i].esFuerte();
			
			System.out.println(password[i] + "  " + esfuerte[i]);
			
		}
		
		

	}

}
