package hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class ejercicio1 {
		public static void main (String[] args) {
			
			ArrayList<String> cadenas = new ArrayList<>();
			cadenas.add("Madrid");
			cadenas.add("Móstoles");
			cadenas.add("Madrid");
			cadenas.add("Vallecas");
			cadenas.add("Frankfurt");
			cadenas.add("Carolina");
			cadenas.add("Vallecas");
			cadenas.add("Alcorcón");
			
			HashMap<String, Integer> frecuencia = new HashMap<>();
			
			for (String cadena : cadenas) {
	            if (frecuencia.containsKey(cadena)) {
	                frecuencia.put(cadena, frecuencia.get(cadena) + 1);
	            } else {
	                frecuencia.put(cadena, 1);
	            }
	        }
	        System.out.println("Frecuencia de palabras:");
	        for (String cadena : frecuencia.keySet()) {
	            System.out.println(cadena + ": " + frecuencia.get(cadena));
	        }
		}
}
