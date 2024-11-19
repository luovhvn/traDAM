package sentencias_control;

import java.util.Random;
import java.util.Scanner;

public class ejercicio9 {
		public static void main (String[] args) {
			
			Scanner scan = new Scanner (System.in);
			Random random = new Random ();
			
			int numrandom = random.nextInt(100) + 1;
			int num;
			
			do {
				System.out.println("Dime un número entre el 1 y el 100");
				num = scan.nextInt();
	            if (num < numrandom) {
	                System.out.println("Es mayor.");
	            } else if (num > numrandom) {
	                System.out.println("Es menor.");
	            }
	        } while (num != numrandom);
			
			System.out.println("Adivinaste...");
			
		}
}
