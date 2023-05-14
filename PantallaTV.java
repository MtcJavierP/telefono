package telefono;

import java.util.List;

public class PantallaTV implements Observador{
	
//	private final Telefono telefono;	
//	
//	 public PantallaTV(Telefono telefono) {
//	        this.telefono = telefono;
//	    }
//	
	
		public void comunicar(List<Integer> telefono) {
			// TODO Auto-generated method stub
							System.out.print("Marcando ");
			for(Integer t: telefono) {
				
				System.out.print(t);
				
				
			}
			System.out.print("...");
		}
	    
    

}
