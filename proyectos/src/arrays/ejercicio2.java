package arrays;

public class ejercicio2 {
		public static void main (String[] args) {
			
			int [] numeros = {1, 2, 3, 4, 5};
			int suma = 0;
			
			for (int numero : numeros) {
				suma += numero;
			}
			System.out.println("El resultado es: " + suma);
		}
}
