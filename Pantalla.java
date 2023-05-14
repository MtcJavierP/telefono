package telefono;

import java.util.List;

public class Pantalla implements Observador{

	 //private final Telefono telefono;

//	    public Pantalla(Telefono telefono) {
//	        this.telefono = telefono;
//	    }

		public void comunicar(List<Integer> telefono) {
			// TODO Auto-generated method stub
							
			for(Integer t: telefono) {
				
				System.out.println(t);
			}
			
		}
	    
	
}
