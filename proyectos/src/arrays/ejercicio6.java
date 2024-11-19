package arrays;

public class ejercicio6 {
		public static void main (String[] args) {
			
			double[] numeros = {2,4,6,7,2,5,9};
			double suma = 0;
			
			for (double numero : numeros) {
				suma += numero;
			}
			double promedio = suma / numeros.length;
			System.out.println("El promedio es " + promedio);
		}
}
