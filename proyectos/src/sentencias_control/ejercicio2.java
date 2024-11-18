package sentencias_control;

import java.util.Scanner;

public class ejercicio2 {
		public static void main (String[] args) {
			
			Scanner scan = new Scanner (System.in);
			
			System.out.println("Dime el primer número");
			int num1 = scan.nextInt();
			System.out.println("Dime el segundo número");
			int num2 = scan.nextInt();
			System.out.println("Dime el tercer número");
			int num3 = scan.nextInt();
			
			if (num1 > num2 && num1 > num3) {
				System.out.println("El mayor es " + num1);
			} else if (num2 > num3) {
				System.out.println("El mayor es " + num2);
			} else if (num3 > num1) {
				System.out.println("El mayor es " + num3);
			} else {
				System.out.println("Los números son iguales");
			}
			
		}
}
