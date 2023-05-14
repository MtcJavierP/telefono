package telefono;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       final int NUMERO_DIGITOS = 10;

	        Telefono telefono = new Telefono();
	       // Pantalla pantalla = new Pantalla(telefono);
	        Teclado teclado = new Teclado(telefono);

	        teclado.simularMarcado(NUMERO_DIGITOS);
	        
	       
	        
	       // PantallaTV tv= new PantallaTV(telefono);
	        telefono.setObservadores(new Pantalla());
	        telefono.setObservadores(new PantallaTV());
	        telefono.notificarObservadores();
	        
	       
	       
	}

}
