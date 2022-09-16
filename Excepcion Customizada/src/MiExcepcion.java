
public class MiExcepcion extends Exception {

	int codigoException;

	public MiExcepcion(int codigoException) {

		this.codigoException = codigoException;
	}
	
	
	public String getMessage() {
		
		String mensaje = "";
		
		if (codigoException == 0) {
			mensaje = "El numero insertado es par.";
			
		} else {
			mensaje = "El numero insertado es impar.";
		}
		
		
		return mensaje;
	}
	
}
