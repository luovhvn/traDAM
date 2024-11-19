package arrays;

public class ejercicio3 {
		public static void main (String[] args) {
			
			int[] numeros = {15,6,4,78,62,41,18};
			int mayor = numeros[0];
			int menor = numeros[0];
			
			for (int numero : numeros) {
				if (numero > mayor) {
					mayor = numero;
				}
				if (numero < menor) {
					menor = numero;
				}
			}
			System.out.println("El núemro mayor es " + mayor + ", y el menor es " + menor);
		}
}
