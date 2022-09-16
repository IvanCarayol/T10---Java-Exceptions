
public class NumeroAleatorio {
	
	private int numRandom = (int)(Math.random()* 500 + 1);;
	private int numDeIntentos = 0;
	
	
	public NumeroAleatorio() {
		
	}
	
	
	public int getNumRandom() {
		return numRandom;
	}




	public void comprobarNumero(int num) {
		
		
		if (num < numRandom) {
			System.out.println("El numero que tienes que adivinar es mayor");
			
		} else if (num > numRandom) {
			System.out.println("El numero que tienes que adivinar es menor");
			
		} else {
			System.out.println("Enorabuena!!! Ese es el numero!! Lo as conseguido en " + numDeIntentos + " intentos");
		}
		
	}
	
	public void sumarIntento() {
		this.numDeIntentos++;
	}
	
	
}
