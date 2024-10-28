package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio1 {
		public static void main (String[] args) {
			
			Scanner scan = new Scanner(System.in); 

	        try { 
	            System.out.print("Ingresa un número positivo: "); 
	            int num = scan.nextInt(); 
	            if (num>=0) {
	            	System.out.println("Ingresaste: " + num);
	            } else {
	            	System.out.println("Te pedí un número positivo");
	            }
	        } catch (InputMismatchException e) { 
	            System.out.println("Te pedí un número positivo."); 
	        } finally { 
	            scan.close(); 
	        } 
		}
}
