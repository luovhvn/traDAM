package sentencias_control;

import java.util.Scanner;

public class ejercicio6 {
		public static void main (String[] args) {
			
			Scanner scan = new Scanner (System.in);
			
			System.out.println("Dime un número");
			int num = scan.nextInt();
			
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + (num * i));
			}
			
		}
}
