package sentencias_control;

import java.util.Scanner;

public class ejercicio3 {
		public static void main (String[] args) {
			
			Scanner scan = new Scanner (System.in);
			
			System.out.println("Dime la nota");
			int nota = scan.nextInt();
			
			if (nota >= 90) {
				System.out.println("Tienes una A");
			} else if (nota >= 80) {
				System.out.println("Tienes una B");
			} else if (nota >= 70) {
				System.out.println("Tienes una C");
			} else if (nota >= 60) {
				System.out.println("Tienes una D");
			} else {
				System.out.println("Tienes una F");
			}
			
		}
}
