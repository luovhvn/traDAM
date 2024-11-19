package sentencias_control;

import java.util.Scanner;

public class ejercicio10 {
		public static void main (String[] args) {
			
			Scanner scan = new Scanner (System.in);
			int operacion;
			
			do {
				System.out.println("1. Sumar");
				System.out.println("2. Restar");
				System.out.println("3. Multiplicar");
				System.out.println("4. Dividir");
				System.out.println("5. Salir");
				System.out.println("¿Qué quieres hacer?");
				operacion = scan.nextInt();
				
				if (operacion >= 1 && operacion <= 4) {
					System.out.println("Dime el primer número");
					int num1 = scan.nextInt();
					System.out.println("Dime el segundo número");
					int num2 = scan.nextInt();
					
					switch (operacion) {
					case 1:
						System.out.println("El resultado es " + (num1 + num2));
						break;
					case 2:
						System.out.println("El resultado es " + (num1 - num2));
						break;
					case 3:
						System.out.println("El resultado es " + (num1 * num2));
						break;
					case 4:
						if (num2 != 0) {
							System.out.println("El resultado es " + (num1 / num2));
						} else {
							System.out.println("No se puede dividir entre 0...");
						} 
						break;
					}
				}
			} while (operacion != 5);
			System.out.println("Chao");
		}
}
