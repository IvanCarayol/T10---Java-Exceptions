
public class main {

	public static void main(String[] args) {
		
		int num ;
		
		try {
            System.out.println("Mensaje mostrado por pantalla");
            
            num = 10;
            
            throw new MiExcepcion(10 % 2);
        }
        catch (MiExcepcion e) {
            System.out.print(e.getMessage());
        }
        finally {
            System.out.println("\nPrograma terminado");
        }

	}

}
