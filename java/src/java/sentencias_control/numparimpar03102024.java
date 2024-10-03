package java.sentencias_control;

import java.util.Scanner;

public class numparimpar03102024 {
	public static void main (String[] arg) {
	
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce un texto");
		String num = leer.nextLine();
		
		if(num/2 == 0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
	}
}
