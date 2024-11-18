package sentencias_control;

import java.util.Scanner;

public class ejercicios1 {
		public static void main (String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Dime un número");
			int num = scan.nextInt();
			
			if (num % 2 == 0) {
				System.out.println("El número es par");
			} else {
				System.out.println("El número es impar");
			}
			
		}
}
