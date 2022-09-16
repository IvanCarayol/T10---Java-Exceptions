
public class Password {

	private int longitud = 8;
	private String contrasenia;


	public Password() {
		generarPassword();
	}

	public Password(int longitud) {

		this.longitud = longitud;
		generarPassword();

	}


	public String toString() {
		return "" + contrasenia;
	}



	private void generarPassword() {

		// Guardamos los caracteres para usar en la contraseña
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		// variable para ir guardando la contraseña
		String AuxContrasenia = "";

		for (int i = 0; i < longitud; i++) {

			int numeroAleatorio = (int) Math.floor(Math.random()*caracteres.length());

			AuxContrasenia += caracteres.charAt(numeroAleatorio);


		}

		contrasenia = AuxContrasenia;


	}


	public boolean esFuerte(){
		int numeros=0;
		int minusculas=0;
		int mayusculas=0;
		//Vamos caracter a caracter y comprobamos que tipo de caracter es
		for (int i=0;i<contrasenia.length();i++){
			if (Character.isLowerCase(contrasenia.charAt(i))){
				minusculas++;
			}else{
				if (Character.isUpperCase(contrasenia.charAt(i))){
					mayusculas++;
				}else{
					numeros++;
				}
			}
		}
		
		//Si la constraseña tiene mas de 5 numeros, mas de 1 minuscula y mas de 2 mayusculas
		if (numeros>=5 && minusculas>=1 && mayusculas>=2){
			return true;
		}else{
			return false;
		}
	}


}
