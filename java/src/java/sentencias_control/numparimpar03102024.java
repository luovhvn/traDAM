package java.sentencias_control;

import java.util.Scanner;

public class numparimpar03102024 {
	public static void main (String[] args) {
	
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce un texto");
		String variable = leer.nextLine();
		int num = Integer.parseInt(variable);
		
		if(num % 2 == 0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
	}

}
