package telefono;

import java.util.ArrayList;
import java.util.List;

public class Telefono {
	
	 private List<Integer> digitos = new ArrayList<>();
	 private List<Observador> observadores= new ArrayList<>();
	 
	 
	 public Telefono() {
		 digitos=new ArrayList<>();
		 observadores= new ArrayList<>();
	 }
	 

		public void addDigito(int nuevoDigito) {
	        digitos.add(nuevoDigito);
	    }

	    public List<Integer> getDigitos() {
	        return digitos;
	    }
	    
	    public void setObservadores(Observador observador) {
			observadores.add(observador);
		}
	    
	    
	    
		public void notificarObservadores() {
	        for (Observador obs : observadores) {
	            obs.comunicar(digitos);
	        }
	        digitos.clear();
	    }
	    
}
