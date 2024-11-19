package sentencias_control;

import java.util.Scanner;

public class ejercicio7 {
		public static void main (String[] args) {
			
			Scanner scan = new Scanner (System.in);
			
			System.out.println("Dime un número entero");
			int num = scan.nextInt();
			
			int digito = 0;
			
			while (num != 0) {
				num /= 10;
				digito++;
			}
			System.out.println("El número tiene " + digito + " dígitos");
		}
}
