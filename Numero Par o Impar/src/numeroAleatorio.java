import java.util.Random;

public class numeroAleatorio {
	
	private int numAleatorio;
	private boolean esPar;
	
	
	public numeroAleatorio() {
		
		Random rnd = new Random();
		
		this.numAleatorio = rnd.nextInt(999);
		
	}

	

	public String toString() {
		return numAleatorio + "";
	}






	public boolean esPar() {
		
		if (numAleatorio % 2 == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	
	
	
	
}
