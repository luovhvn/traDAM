package arrays;

import java.util.HashSet;

public class ejercicio5 {
		public static void main (String[] args) {
			
			int[] numeros = {1, 2, 3, 4, 2, 4, 3, 6, 7, 2};
	        HashSet<Integer> vistos = new HashSet<>();
	        HashSet<Integer> repetidos = new HashSet<>();

	        for (int numero : numeros) {
	            if (!vistos.add(numero)) {
	                repetidos.add(numero);
	            }
	        }
	        System.out.println("Números repetidos: " + repetidos);
		}
}
