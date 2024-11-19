package arrays;

import java.util.Arrays;

public class ejercicio7 {
		public static void main (String[] args) {
			
			int[] numeros = {6,15,4,9,2,13,25,20,7};
			
			Arrays.sort(numeros);
			
			for (int numero : numeros) {
				System.out.println(numero);
			}
			
		}
}
